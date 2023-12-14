package com.khalil.bookbroker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.khalil.bookbroker.models.Book;
import com.khalil.bookbroker.models.User;
import com.khalil.bookbroker.services.BookService;
import com.khalil.bookbroker.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	BookService bookServ;

	@Autowired
	UserService userServ;

//	@GetMapping("/")
//	public String redirect() {
//		return "redirect:/books";
//	}

	@GetMapping("/books")
	public String index(Model model, HttpSession session) {
		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user = userServ.findById(userId);
		model.addAttribute("user", user);

		List<Book> books = bookServ.allBooks();
		model.addAttribute("books", books);
		return "home.jsp";
	}
	
	@GetMapping("/bookBroker")
	public String bookBroker(Model model, HttpSession session) {
		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user = userServ.findById(userId);
		model.addAttribute("user", user);

		List<Book> books = bookServ.allBooks();
		model.addAttribute("books", books);
		return "book_broker.jsp";
	}
	
	@GetMapping("/books/{borrowId}/borrow")
	public String bookBorrow(Model model,@PathVariable("borrowId") Long borrowId,
			HttpSession session) {
		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		User user = userServ.findById(userId);
		model.addAttribute("user", user);

		Book borrowedBook = bookServ.findBook(borrowId);
		borrowedBook.setBorrower(user);
		bookServ.updateBook(borrowedBook);
		
		return "redirect:/bookBroker";
	}
	
	@GetMapping("/books/{returnId}/return")
	public String bookReturn(Model model,@PathVariable("returnId") Long returnId,
			HttpSession session) {
		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
		
		Book returndedBook = bookServ.findBook(returnId);
		returndedBook.setBorrower(null);
		bookServ.updateBook(returndedBook);
		
		return "redirect:/bookBroker";
	}

	@GetMapping("/books/{bookId}")
	public String show(Model model, @PathVariable("bookId") Long bookId, HttpSession session) {

		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {
			User user = userServ.findById(userId);
			model.addAttribute("user", user);

			Book book = bookServ.findBook(bookId);
			model.addAttribute("book", book);
			if (book.getUser().equals(user)) {
				return "show_user_book.jsp";
			} else {
				return "show_book.jsp";
			}
		}
	}

	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, HttpSession session) {

		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {

			return "new_book.jsp";
		}
	}

	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "new_book.jsp";
		} else {

			Long UserId = (Long) session.getAttribute("userId");
			User loggedInUser = userServ.findById(UserId);
			book.setUser(loggedInUser);
			bookServ.createBook(book);

			return "redirect:/books";
		}
	}

	@GetMapping("/edit/{id}")
	public String updateBook(Model model, @PathVariable("id") Long id, HttpSession session) {
		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		} else {
			Book thisBook = bookServ.findBook(id);
			model.addAttribute("book", thisBook);
			return "edit_book.jsp";
		}
	}

	@PutMapping("/books/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {

		if (result.hasErrors()) {
			return "edit_book.jsp";
		} else {
			Long UserId = (Long) session.getAttribute("userId");
			User loggedInUser = userServ.findById(UserId);
			book.setUser(loggedInUser);
			bookServ.updateBook(book);
			return "redirect:/books";
		}
	}

	@DeleteMapping("/books/{id}")
	public String destroy(@PathVariable("id") Long id) {
		bookServ.deleteBook(id);
		return "redirect:/books";
	}
	@GetMapping("/books/{id}/delete")
	public String delete(@PathVariable("id") Long id, HttpSession session) {
		// Route Gard
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/";
		}
    	bookServ.deleteBook(id);
    	
    	return "redirect:/books";
	}
}
