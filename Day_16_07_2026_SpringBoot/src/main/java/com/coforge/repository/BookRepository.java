package com.coforge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coforge.entities.Book;

public interface BookRepository  extends JpaRepository<Book, Integer> {
	
	List<Book> findByAuthor(String author);
//	
	//Book findByTitle(String title);
	
	//@Query(value="select * from book where title=?",nativeQuery=true)
//	@Query(value="select b from booktable  b where title=:title")
//	Book findByTitle(@Param("title")String title);
	
	@Query(name="getBookByTitle")
	Book findByTitle(@Param("title")String title);
	
//	Book findByAuthorMobile(String authormobile);//prefix findBy... or getBy property name

	//query
	//select * from book where title like 's%'
	
	
//	@Query(value="select b from Book b where author=:author")
//	List<Book> getAllBooksByAuhorName(@Param("author")String author);
//	@Query(name="getAllBooksByAuthor")
//	List<Book> getAllBooksByAuhorName(@Param("author")String author);
	
	
	
}
