package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BestellSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(BestellSystem1Application.class, args);
	}
	@GetMapping("")
	public String getLoginPage() {
		return "index";
	}

}
