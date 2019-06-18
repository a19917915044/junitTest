package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShowController {

	@Autowired
	private ShowMe showMe;
	@Autowired
	private ResourceLoader resourceLoader;

	@RequestMapping("/hello")
	public String hello() throws IOException {

		Resource resource = resourceLoader.getResource("classpath:application-location.properties");
		System.out.println(resource.getFile().getAbsolutePath());
		

		return showMe.getHello();
	}
}
