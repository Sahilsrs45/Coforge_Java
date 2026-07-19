package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Book;
import com.coforge.repository.BookRepository;

@Repository
public class BookDao {

    @Autowired
    private BookRepository repository;

    // Get All Books
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    // Add Book
    public Book addBook(Book book) {
        return repository.save(book);
    }

    // Get Book By Id
    public Optional<Book> getBookById(int id) {
        return repository.findById(id);
    }

    // Delete Book
    public void deleteBook(int id) {
        repository.deleteById(id);
    }
    
//    public List<Book> findByAuther(String author){
//    	return repository.findByAuthor(author);
//    }
    
    
    public Book findByTitle(String title) {
    	return repository.findByTitle(title);
    }

}