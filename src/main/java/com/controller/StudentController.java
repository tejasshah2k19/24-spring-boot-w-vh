package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String calculateResult(StudentBean student, Model model) {
		// how to read input = form - data
		// request.getParameter();

		// validation
		boolean isError = false;

		if (student.getStudentName() == null || student.getStudentName().trim().length() == 0) {
			isError = true;
			model.addAttribute("studentNameError", "Please Enter Student Name");
		}
		if (student.getPerc() == null) {
			isError = true;
			model.addAttribute("percError", "Please Enter Perce");
		}
		if (student.getBornYear() == null) {
			isError = true;
			model.addAttribute("bornYearError", "Please Enter BornYear");
		}
		
		
		model.addAttribute("student",student);

		if (isError == true) {
			return "InputStudent";
		} else {

			// process
			String result = "";
			if (student.getPerc() < 35) {
				System.out.println("NOT ELIG");
				result = "NOT ELIG";
			} else if (student.getPerc() >= 90) {
				System.out.println("X");
				result = "X";
			} else if (student.getPerc() >= 70) {
				System.out.println("B");
				result = "B";
			} else {
				System.out.println("A");
				result = "A";
			}
			model.addAttribute("result", result);

			return "StudentResult";// jsp name
		}
	}
}
