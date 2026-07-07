package com.coforge.Day_03_07_2026_CollectionPrj;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private int id;
	private double salary;
	private String address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String name, int id, double salary, String address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}



	



//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.id -o.id;
//	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(this.salary,o.salary);
	}
	
	
	
	

}
