package com.aep.spring.lessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		System.out.println("Welcome to my DI Lessons");
	}
}
