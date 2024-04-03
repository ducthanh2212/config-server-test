package com.service.clientTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class TestController {

	@Autowired
	private Environment en;

	@RequestMapping("/test")
	@GetMapping
	public String test() {
		System.err.println("xin chao");
		return en.getPropertySources().get(0).getName() + " xin chao";
	}
}
