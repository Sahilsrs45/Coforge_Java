package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.coforge.entities.Book;
import com.coforge.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Get All Books
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {

        List<Book> bookList = bookService.getAllBooks();

        return ResponseEntity.ok(bookList);
    }

    // Get Book By Id
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {

        Book book = bookService.getBookById(id);

        return ResponseEntity.ok(book);
    }

    // Add Book
    @PostMapping
    public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {

        Book savedBook = bookService.addBook(book);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
    }

    // Update Book
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id,
                                           @RequestBody Book book) {

        Book updatedBook = bookService.updateBook(id, book);

        return ResponseEntity.ok(updatedBook);
    }

    // Delete Book
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {

        String message = bookService.deleteBook(id);

        return ResponseEntity.ok(message);
    }
    
    
//    @GetMapping("/author/{author}")
//    public List<Book> findByAuthor(@PathVariable("author") String  author){
//    	return bookService.findByAuthor(author);
//    }
    @GetMapping("/title/{title}")
    public Book findByTitle(@PathVariable("title")String title) {
    	return bookService.findByTitle(title);
    }
}