package com.accenture.config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@Value("${message: Default Hello}")
	private String message;
	
	@GetMapping("/")
	public String welcome() {
		return message;
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "hi" + input + " bla bla";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
