package com.sheryians.major;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "com.sheryians.major")
public class MajorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajorApplication.class, args);
	}

}
