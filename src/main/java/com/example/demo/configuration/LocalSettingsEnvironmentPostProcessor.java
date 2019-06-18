package com.example.demo.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocalSettingsEnvironmentPostProcessor implements EnvironmentPostProcessor {

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment,
			SpringApplication springApplication) {

		String location = "";
		try {
			location = ResourceUtils.getURL("classpath:").getPath();
			int index = location.indexOf("WNB-INF");
			System.out.println("-=======================" + location);
			if (index <= 0) {
				return;
			}
			location = location.substring(0, index) + "config/application.properties";
			System.out.println("============locationFinal" + location);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File file = new File(location);
		if (file.exists()) {
			MutablePropertySources propertySources = configurableEnvironment.getPropertySources();
			Properties properties = loadProperties(file);
			propertySources.addFirst(new PropertiesPropertySource("Config", properties));
		}
	}

	private Properties loadProperties(File f) {
		FileSystemResource resource = new FileSystemResource(f);
		try {
			return PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException ex) {
			throw new IllegalStateException("Failed to load local settings from " + f.getAbsolutePath(), ex);
		}
	}
}
