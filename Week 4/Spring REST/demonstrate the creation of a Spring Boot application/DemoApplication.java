package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation enables auto-configuration and component scanning
@SpringBootApplication
public class DemoApplication {

    // Entry point of the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
