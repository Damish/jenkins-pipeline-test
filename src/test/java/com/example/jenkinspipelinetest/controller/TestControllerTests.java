package com.example.jenkinspipelinetest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTests {

	@Autowired
	TestController testController;

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("verify test hello world")
	void test1(){
		Assertions.assertEquals("Hello world!",testController.test1());
		Assertions.assertNotEquals("",testController.test1());
	}

	@Test
	@DisplayName("verify test jenkins pipeline works")
	void test2(){
		Assertions.assertEquals("Jenkins pipeline works!",testController.test2());
		Assertions.assertNotEquals("",testController.test2());
	}
}
