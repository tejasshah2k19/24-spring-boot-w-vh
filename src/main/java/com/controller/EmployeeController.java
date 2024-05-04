package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EmployeeBean;
import com.util.Validators;

@Controller
public class EmployeeController {

	// below method will open jsp
	@GetMapping("newemployee")
	public String newEmployee() {
		return "NewEmployee"; // jsp name
	}

	@PostMapping("saveEmployee")
	public String saveEmployee(EmployeeBean employee, Model model) {
		boolean isError = false;
		if (Validators.isEmpty(employee.getFirstName())) {
			isError = true;
			model.addAttribute("firstNameError", "Please Enter FirstName");
		}
		if (Validators.isEmpty(employee.getEmail())) {
			isError = true;
			model.addAttribute("emailError", "Please Enter Email");
		}
		if (Validators.isEmpty(employee.getGender())) {
			isError = true;
			model.addAttribute("genderError", "Please Select Gender");
		}
		if(employee.getCity().equals("-1")) {
			isError =true;
			model.addAttribute("cityError","Please Select City");
		}
		
		
		model.addAttribute("employee", employee);

		if (isError == true) {
			// go back input
			return "NewEmployee";
		} else {
			// go ahead success
			return "ViewEmployee";
		}

	}

}
