package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;

@Controller
public class StudentController {

	// open jsp --method ----1
	@GetMapping("/inputstudent")
	public String inputStudent() {
		return "InputStudent"; // jsp name
	}

	// submit

	@PostMapping("/calculateResult")
	public String calculateResult(StudentBean student) {
		// how to read input = form - data
		// request.getParameter();

		// process

		if (student.getPerc() < 35) {
			System.out.println("NOT ELIG");
		} else if (student.getPerc() >= 90) {
			System.out.println("X");
		} else if (student.getPerc() >= 70) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}

		return "Welcome";// jsp name
	}
}
