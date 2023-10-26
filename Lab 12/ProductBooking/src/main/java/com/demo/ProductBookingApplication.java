package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//The @SpringBootApplication annotation indicates that this is the main class of a Spring Boot application.

@SpringBootApplication
public class ProductBookingApplication {
	// The main method is the entry point for the application.

	public static void main(String[] args) {
		// The SpringApplication.run() method bootstraps and launches the Spring Boot
		// application.

		SpringApplication.run(ProductBookingApplication.class, args);
	}

}
