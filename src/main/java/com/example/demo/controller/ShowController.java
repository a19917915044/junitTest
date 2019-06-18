package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShowController {

	@Autowired
	private ShowMe showMe;
	@Autowired
	private DataSourceProperties dataSourceProperties;
	@Autowired
	private ResourceLoader resourceLoader;

	@RequestMapping("/hello")
	public String hello() throws IOException {

//        Resource resource = resourceLoader.getResource("file:\\");
//        resource.getFile()
//		System.out.println(ClassUtils.getDefaultClassLoader().getResource("../").getPath());
		System.out.println(ResourceUtils.getURL("").getPath());
		System.out.println(ResourceUtils.getURL("classpath:").getPath());
		System.out.println();
//        System.out.println(resource.getFile());

		System.out.println(showMe.getHand());
		System.out.println(showMe.getFoot());
		System.out.println(showMe.getHello());

		System.out.println();
		System.out.println(dataSourceProperties.getDriverClassName());
		System.out.println(dataSourceProperties.getUrl());
		System.out.println(dataSourceProperties.getUsername());
		System.out.println(dataSourceProperties.getPassword());
		System.out.println(dataSourceProperties.getMaxWait());

		System.out.println();
		System.out.println(showMe.getDriverClassName());
		System.out.println(showMe.getUrl());
		System.out.println(showMe.getUsername());
		System.out.println(showMe.getPassword());

		return showMe.getHello();
	}
}
