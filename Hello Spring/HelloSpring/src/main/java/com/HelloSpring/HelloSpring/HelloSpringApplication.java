package com.HelloSpring.HelloSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.HelloSpring.HelloSpring.Testing.Test;
@SpringBootApplication
public class HelloSpringApplication {

/**
 * The main method serves as the entry point for the Spring Boot application.
 * It starts the application by invoking SpringApplication.run with the 
 * HelloSpringApplication class. It also creates an instance of the Test class
 * and calls its run method.
 *
 * @param args command-line arguments passed to the application
 */
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		Test test = new Test();
		test.run();

	}
}
