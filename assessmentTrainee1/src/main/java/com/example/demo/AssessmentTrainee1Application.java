package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.src")
@SpringBootApplication
@EntityScan(basePackages="com.src.beans")

public class AssessmentTrainee1Application {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentTrainee1Application.class, args);
	}

}
