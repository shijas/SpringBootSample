package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String capitalize(String arg) {
		return arg.toUpperCase();
	}

}
