package com.coforge.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class LibraryCard {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer cardId;

	private String cardNumber;
	
	private String issueDate;
	@OneToOne
	@JoinColumn(name = "sid",referencedColumnName = "sid")
	@JsonBackReference
	private Student student;

	public LibraryCard() {
		// TODO Auto-generated constructor stub
	}

	public LibraryCard(Integer cardId, String cardNumber, String issueDate, Student student) {
		super();
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.issueDate = issueDate;
		this.student = student;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "LibraryCard [cardId=" + cardId + ", cardNumber=" + cardNumber + ", issueDate=" + issueDate
				+ ", student=" + student + "]";
	}
	
	
}
