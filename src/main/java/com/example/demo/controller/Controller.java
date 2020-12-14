package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hi Rahul, its my first attempt on docker";
				
	}
	

}
