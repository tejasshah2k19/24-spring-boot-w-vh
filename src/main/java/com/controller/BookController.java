package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		if (result.hasErrors()) { // validation fail
			return "NewBook"; // go back
		} else {
			// db insert -> db : table : spring -> ready s
			// mysql-connector.jar
			// dbConnection -> open -> preparedStatement ->
			stmt.update("insert into books (bookName,authorName) values (?,?)", book.getBookName(),
					book.getAuthorName());

			return "ViewBook";
		}
	}

	@GetMapping("/listbooks")
	public String listBooks(Model model) {
		List<BookBean> books = stmt.query("select * from books", new BeanPropertyRowMapper<BookBean>(BookBean.class));
		model.addAttribute("books", books);
		return "ListBooks";
		// c bala -> obj -> list.add(obj);
		// c++ bala -> obj
		// java kethy
		// java yashwant

	}

	@GetMapping("/searchbook")
	public String searchBook() {
		return "SearchBook";// jsp name -> must not add .jsp
	}

	@PostMapping("/searchbook")
	public String searchBookDb(BookBean bookBean, Model model) {

		// select * from book where bookName like '%java%';
		// select * from books where bookName like 'java';

		List<BookBean> books = stmt.query("select * from books where bookName like ?",
				new BeanPropertyRowMapper<BookBean>(BookBean.class),
				new Object[] { "%" + bookBean.getBookName() + "%" });
		model.addAttribute("books", books);
		return "ListBooks";
	}

	@GetMapping("/deletebook")
	public String deleteBook(BookBean bookBean) {
		// delete from books -> remove all books
		// delete from books where bookId = XXX
		System.out.println(bookBean.getBookId());

		// update
		// query

		stmt.update("delete from books where bookId = ?", bookBean.getBookId());
		return "redirect:/listbooks";
	}

	@GetMapping("/viewbook")
	public String viewBook(BookBean bookBean, Model model) {

		BookBean book = stmt.queryForObject("select * from books where bookId  = ?",
				new BeanPropertyRowMapper<BookBean>(BookBean.class), new Object[] { bookBean.getBookId() });// id :
																											// single :
		// 1 record
		model.addAttribute("book", book);

		return "ViewBookAllInfo";
	}

	// href->url ->GET

	@GetMapping("/editbook")
	public String editBook(BookBean bookBean, Model model) {

		BookBean book = stmt.queryForObject("select * from books where bookId  = ?",
				new BeanPropertyRowMapper<BookBean>(BookBean.class), new Object[] { bookBean.getBookId() });// id :
		model.addAttribute("book", book);

		return "EditBook";
	}

	@PostMapping("/updatebook")
	public String updateBook(BookBean bookBean) {
		// update
		stmt.update("update books set bookName = ? , authorName = ? where bookId = ? ", bookBean.getBookName(),
				bookBean.getAuthorName(), bookBean.getBookId());
		return "redirect:/listbooks";
	}

}
