package com.example.sqlDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.example.sqlDemo.rest"
		})
public class SqlDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SqlDemoApplication.class, args);
	}

}
