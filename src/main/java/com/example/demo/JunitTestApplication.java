package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.ShowController;
import com.example.demo.controller.ShowMe;

@SpringBootApplication
public class JunitTestApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(JunitTestApplication.class, args);
	}
	
	
}


