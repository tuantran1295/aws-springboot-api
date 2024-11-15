package com.apress.AWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class UserRegistrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationAppApplication.class, args);
	}
	
	@RequestMapping("/")
	public String helloMessage() {
		return "Hello Spring Boot!";
	}

}
