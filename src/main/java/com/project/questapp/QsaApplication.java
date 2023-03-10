package com.project.questapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class QsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QsaApplication.class, args);
	}

}
