package com.example.jenkinspipelinetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsPipelineTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineTestApplication.class, args);

		System.out.println("Application started!!!");
	}

}
