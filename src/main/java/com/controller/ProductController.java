package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;
import com.bean.UserBean;

@Controller
public class ProductController {

	@GetMapping("/newproduct")
	public String newProduct() {
		return "NewProduct";// jsp name - jsp open
	}

	@PostMapping("/saveproduct")
	public String saveProduct(ProductBean product) {

		// String productName = request.getParameter("productName");
		// bean
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		return "Home";
	}
}
