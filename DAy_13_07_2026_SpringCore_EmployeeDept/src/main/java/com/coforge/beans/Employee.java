package com.coforge.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${emp.eid}")
	private int eid;
	@Value("${emp.ename}")
	private String ename;
	@Value("${emp.salary}")
	private double salary;
	@Value("${emp.mobileno}")
	private long mobileno;
	@Value("${emp.email}")
	private String email;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double salary, long mobileno, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.mobileno = mobileno;
		this.email = email;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", mobileno=" + mobileno
				+ ", email=" + email + "]";
	}
	
	

}
