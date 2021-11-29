package com.sds.demo;

import com.sds.demo.service.AuthorService;
import com.sds.demo.service.AuthorServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public AuthorService authorService() {
		return new AuthorServiceImpl();
	}

}
