package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JunitTestApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(JunitTestApplication.class, args);
	}
	
	@Bean
	public ShowMe showMe() {
		ShowMe sm = new ShowMe();
		sm.setFoot("160");
		sm.setHand("60");
		return sm;
	}
}


