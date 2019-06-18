package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.ShowMe;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTestApplicationTests {

	@Autowired
	private ShowMe showMe;
	
	@Test
	public void contextLoads() {
		System.out.println(showMe);
	}

}
