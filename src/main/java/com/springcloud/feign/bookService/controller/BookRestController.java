package com.springcloud.feign.bookService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.feign.bookService.bean.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {
	@Autowired
	private Environment environment;

	@GetMapping("/data")
	public String bookData() {
		return "data on BOOK-SERVICE, Running on port:" + environment.getProperty("local.server.port");
	}

	@GetMapping("/{bookId}")
	public Book getBookById(@PathVariable Integer bookId) {
		return new Book(bookId, "Java with Microservices", 10000.00);
	}

	@GetMapping("/getall")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1, "java with Microservice", 10000.0), new Book(2, "Devops", 12000.0),
				new Book(3, "AWS", 13000.0));
	}

	@GetMapping("/entity")
	public ResponseEntity<String> getEntityData() {
		return new ResponseEntity<String>("Hello from BookRestController", HttpStatus.OK);
	}
}
