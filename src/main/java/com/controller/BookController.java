package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.BookBean;

@Controller
public class BookController {

	// jsp open
	@GetMapping("/newbook")
	public String newBook() {
		return "NewBook";
	}

	// save
	@PostMapping("/savebook")
	public String saveBook(@Validated BookBean book, BindingResult result, Model model) {
		model.addAttribute("book", book);
		if (result.hasErrors()) {
			return "NewBook";
		} else {
			return "ViewBook";
		}
	}
}
