package com.nathan.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Note:
 * 
 * The @SpringBootApplication annotation is equivalent to @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan.
 */

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
