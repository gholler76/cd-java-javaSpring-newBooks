package com.holler.newbooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.holler.newbooks.models.Book;
import com.holler.newbooks.repositories.BookRepo;


@Service
public class BookService {
	private final BookRepo bookRepo;
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepo.findAll();
	}
	
	public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

	public Book createBook(Book book) {
		return bookRepo.save(book);
	}

	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}