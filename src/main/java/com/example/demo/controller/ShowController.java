package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ShowMe;

@Controller
@RequestMapping("/api")
public class ShowController {

	@Autowired
	private ShowMe showMe;

	@RequestMapping("/hello")
	public String hello() {

		return showMe.getHello();
	}
}
