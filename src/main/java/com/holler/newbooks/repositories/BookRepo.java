package com.holler.newbooks.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.holler.newbooks.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	// this method retrieves all the books from the database
    List<Book> findAll();
    Optional<Book> findById(Long id);
    
    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
    //this method deletes book by ID
    void deleteById(Long id);
    
    }