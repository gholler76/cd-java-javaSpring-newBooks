package com.holler.newbooks.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.holler.newbooks.models.Book;
import com.holler.newbooks.services.BookService;
	
	@Controller
	public class HomeController {
		private final BookService bookService;
		public HomeController(BookService bookServ) {
			this.bookService = bookServ;
		}
		
		@RequestMapping ("/")
		public String index(Model model) {
			model.addAttribute("books", bookService.getAllBooks()); 
			return "books.jsp";
		}
		
		@RequestMapping ("/create")
		public String create(Model model) {
			model.addAttribute("book", new Book());
			return "create.jsp";
		}
//		
		@RequestMapping(value="/create", method=RequestMethod.POST)
		public String createBook(@ModelAttribute("book") Book book, BindingResult result) {
			if (result.hasErrors()) {
				return "create.jsp";
			} else {
			bookService.createBook(book);
			return "redirect:/";
		}
		}
			
//		
		@RequestMapping("/books/{id}")
		public String bookInfo(@PathVariable("id") Long id, Model model) {
			model.addAttribute("book", bookService.findBook(id));
			return "edit.jsp";
		}
		
		@RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
		public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
			if (result.hasErrors()) {
				return "edit.jsp";
			} else {
				bookService.updateBook(book);
				return "redirect:/";
			}
		}
//	    
//	    
		@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	    public String destroy(@RequestParam("id") Long id) {
			bookService.deleteBook(id);
	        return "redirect:/";
	    }
	    
	 
		
	}
