package com.coforge.entities;

import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "booktable")
@NamedQuery(
	    name = "getBookByTitle",
	    query = "SELECT b FROM Book b WHERE b.title = :title"
	)
//@NamedQuery(name="getAllBookByAuthor",query="select b from Book b where b.author=:author")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;
    @NotBlank(message = "Title cannot be blank")
    @Size(min = 3, max = 50, message = "Title must be between 3 and 50 characters")
    private String title;

    @NotBlank(message = "Author cannot be blank")
    @Size(min = 3, max = 30, message = "Author name must be between 3 and 30 characters")
    private String author;

    @NotBlank(message = "Mobile number cannot be blank")
    @Pattern(
        regexp = "^[6-9]\\d{9}$",
        message = "Phone number must be a valid 10-digit Indian mobile number"
    )
    private String authormobile;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Please enter a valid email")
    private String email;

    @DecimalMin(value = "100", message = "Minimum price is ₹100")
    @DecimalMax(value = "5000", message = "Maximum price is ₹5000")
    private double price;
    
    public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, @Size(min = 3, message = "title can't le less than 3 char's") @NotBlank String title,
			@NotBlank String author,
			@Pattern(regexp = "[6,7,8,9][0-9] {9}", message = "Mobile no must start with 6,7,8 or 9 & must be with length 10") String authormobile,
			@Email(message = "Please enter valid email") String email,
			@DecimalMin(value = "100", inclusive = true, message = "Book min cost is 100rs") double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.authormobile = authormobile;
		this.email = email;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthormobile() {
		return authormobile;
	}

	public void setAuthormobile(String authormobile) {
		this.authormobile = authormobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", authormobile=" + authormobile
				+ ", email=" + email + ", price=" + price + "]";
	}
    

}    