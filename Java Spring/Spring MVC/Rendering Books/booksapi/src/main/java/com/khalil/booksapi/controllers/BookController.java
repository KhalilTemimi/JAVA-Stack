package com.khalil.booksapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.khalil.booksapi.models.Book;
import com.khalil.booksapi.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	@GetMapping("/books/{bookId}")
	public String show(Model model,@PathVariable("bookId")Long bookId) {
		
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		return "show.jsp";
	}

}
