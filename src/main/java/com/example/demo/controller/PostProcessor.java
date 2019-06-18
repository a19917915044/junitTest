package com.example.demo.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

//@ConditionalOnBean(ShowMe.class)
public class PostProcessor implements BeanPostProcessor {

	@Autowired
	private ShowMe showMe;
	@Autowired
	private ResourceLoader resourceLoader;

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if(!(bean instanceof ShowMe)) {
			System.out.println(beanName);
			return null;
		}
		System.out.println("这里是beanpropcessor");
		System.out.println(showMe.getHello());
		showMe.setHello("haha");
//		try {
//
//			Resource resource = resourceLoader.getResource("classpath:application-location1.properties");
//			System.out.println(resource);
//			System.out.println(resource.getFile().getAbsolutePath());
//
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("文件未找到 ： 走默认配置");
//		} catch (IOException e) {
//			System.out.println("文件获取失败：走默认配置");
//			e.printStackTrace();
//		}

		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
