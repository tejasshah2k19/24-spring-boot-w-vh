package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.BookBean;

@Controller
public class BookController {

	@Autowired
	JdbcTemplate stmt;
	
	// jsp open
	@GetMapping("/newbook")
	public String newBook() {
		return "NewBook";
	}

	// save
	@PostMapping("/savebook")
	public String saveBook(@Validated BookBean book, BindingResult result, Model model) {
		model.addAttribute("book", book);
		if (result.hasErrors()) { //validation fail 
			return "NewBook"; //boback 
		} else {
			//db insert -> db : table : spring -> ready s
			//mysql-connector.jar 
			//dbConnection -> open -> preparedStatement -> 
			stmt.update("insert into books (bookName,authorName) values (?,?)",book.getBookName(),book.getAuthorName());
			return "ViewBook";
		}
	}
}
