package com.bean;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookBean {
	
	Integer bookId;
	@NotBlank
	String bookName;
	@NotBlank
	String authorName;
}