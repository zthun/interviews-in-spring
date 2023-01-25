package com.zthunworks.interviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={ "com.zthunworks.interviews" })
public class ZInterviewApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZInterviewApplication.class, args);
	}
}
