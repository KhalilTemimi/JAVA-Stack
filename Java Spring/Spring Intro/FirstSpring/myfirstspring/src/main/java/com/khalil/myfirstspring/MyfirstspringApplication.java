package com.khalil.myfirstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class MyfirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringApplication.class, args);
	}
	 @RequestMapping("/")
	 public String hello() {
		 return "Hello World! It's my first spring App!";
	 }

}
