package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ShowController {

	@Autowired
	private ShowMe showMe;

	@RequestMapping("/hello")
	public String hello() {

		return showMe.getHello();
	}
}
