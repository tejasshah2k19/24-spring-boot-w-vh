package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String  signup() {
		return "Signup";//jsp name 
	}
	
	@GetMapping("/login")
	public String login() {
		return "Login"; 
	}

	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}
}
