package com.cos.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
	

}
