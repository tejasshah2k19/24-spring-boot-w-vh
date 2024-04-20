package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signup() {
		return "Signup";// jsp name
	}

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {
		// request.getParameter()
		// bean
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "Login";
	}
}
