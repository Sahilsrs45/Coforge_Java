package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.BookDao;
import com.coforge.entities.Book;
import com.coforge.exceptions.BookNotFoundException;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    // Get All Books
    public List<Book> getAllBooks() {

        List<Book> books = bookDao.getAllBooks();

        if (books.isEmpty()) {
            throw new BookNotFoundException("No books found.");
        }

        return books;
    }

    // Add Book
    public Book addBook(Book book) {

        if (book == null) {
            throw new RuntimeException("Book details cannot be null.");
        }

        return bookDao.addBook(book);
    }

    // Get Book By Id
    public Book getBookById(int id) {

        return bookDao.getBookById(id)
                .orElseThrow(() ->
                        new BookNotFoundException("Book with ID " + id + " not found."));
    }

    // Update Book
    public Book updateBook(int id, Book book) {

        Book existingBook = bookDao.getBookById(id)
                .orElseThrow(() ->
                        new BookNotFoundException("Book with ID " + id + " not found."));

        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());

        return bookDao.addBook(existingBook);
    }

    // Delete Book
    public String deleteBook(int id) {

        Book existingBook = bookDao.getBookById(id)
                .orElseThrow(() ->
                        new BookNotFoundException("Book with ID " + id + " not found."));

        bookDao.deleteBook(existingBook.getBookId());

        return "Book deleted successfully.";
    }
//    public List<Book> findByAuthor(String author){
//    	return bookDao.findByAuther(author);
//    }
    
    
    public Book findByTitle(String title) {
    	return bookDao.findByTitle(title);
    }
}