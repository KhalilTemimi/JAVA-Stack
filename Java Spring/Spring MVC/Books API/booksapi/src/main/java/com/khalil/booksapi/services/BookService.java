package com.khalil.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.khalil.booksapi.models.Book;
import com.khalil.booksapi.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // Update a book
    public Book updateBook(Book updatedBook) {
    	return bookRepository.save(updatedBook);
    }
    // Delete a book
    public void deleteBook(Long id) {
    	Optional<Book> book = bookRepository.findById(id);
    	if(book.isPresent()) {
    		bookRepository.deleteById(id);
    	}
    }
}
