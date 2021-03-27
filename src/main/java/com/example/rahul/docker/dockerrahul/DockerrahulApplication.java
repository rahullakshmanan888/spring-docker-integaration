package com.example.rahul.docker.dockerrahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerrahulApplication {
	@GetMapping("/message")
	public String getMesssage() {
		return "hello world";

	}

	public static void main(String[] args) {
		SpringApplication.run(DockerrahulApplication.class, args);
	}

}
