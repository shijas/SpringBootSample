package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
@RequestMapping("/v1")
public class TestController {
	
	@Autowired
	TestService testserv;
	
	@GetMapping("/{test1}/customer")
	public String test(@PathVariable("test1") String test1) {
		return testserv.capitalize(test1);
	}

}
