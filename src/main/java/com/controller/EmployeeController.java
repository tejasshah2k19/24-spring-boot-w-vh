package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EmployeeBean;

@Controller
public class EmployeeController {

	
	//below method will open jsp 
	@GetMapping("newemployee")
	public String newEmployee() {
		return "NewEmployee"; //jsp name 
	}

	@PostMapping("saveEmployee")
	public String saveEmployee(EmployeeBean employee,Model model) {
		model.addAttribute("employee",employee);
		return "ViewEmployee";
	}

}
