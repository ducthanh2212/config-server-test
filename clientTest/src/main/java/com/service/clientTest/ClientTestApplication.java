package com.service.clientTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.service")
public class ClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientTestApplication.class, args);
	}

}
