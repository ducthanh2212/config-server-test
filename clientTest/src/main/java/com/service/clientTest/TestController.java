package com.service.clientTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${spring.datasource.password}")
	private String confiString;
	
	@Autowired
	BlogRespository blogRespository;

	@RequestMapping("/test")
	@GetMapping
	public String test() {
		System.err.println("xin chao");
		return confiString;
	}
	
	@GetMapping("/blog")
    public List<Blog> index(){
        return blogRespository.findAll();
    }
}
