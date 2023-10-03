package com.pro.practdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping
	public String sksa() {
		return "hello world!";
	}
}
