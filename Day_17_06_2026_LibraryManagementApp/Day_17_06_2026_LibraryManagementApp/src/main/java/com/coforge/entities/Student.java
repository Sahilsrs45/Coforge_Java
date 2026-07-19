package com.coforge.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;

    private String sname;

    private String branch;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "stud_subj",
            joinColumns = @JoinColumn(name = "sid"),
            inverseJoinColumns = @JoinColumn(name = "subId")
    )
    private List<Subject> subjectList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addrId", referencedColumnName = "addrId")
    private Address address;
    @OneToOne(cascade = CascadeType.ALL,mappedBy ="student")
    @JsonManagedReference
    private LibraryCard libraryCard;

    // Default Constructor
    public Student() {
    }

	public Student(Integer sid, String sname, String branch, List<Subject> subjectList, Address address,
			LibraryCard libraryCard) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.subjectList = subjectList;
		this.address = address;
		this.libraryCard = libraryCard;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LibraryCard getLibraryCard() {
		return libraryCard;
	}

	public void setLibraryCard(LibraryCard libraryCard) {
		this.libraryCard = libraryCard;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", subjectList=" + subjectList
				+ ", address=" + address + ", libraryCard=" + libraryCard + "]";
	}

    
}