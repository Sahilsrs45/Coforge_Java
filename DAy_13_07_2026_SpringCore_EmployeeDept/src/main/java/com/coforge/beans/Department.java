package com.coforge.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Department {
	@Value("${dept.id}")
	private int id;
	@Value("${dept.name}")
	private String name;
	@Value("${dept.loc}")
	private String loc;
	@Autowired
	private List<Employee> empList;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(List<Employee> empList) {
		super();
		this.empList = empList;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", loc=" + loc + ", empList=" + empList + "]";
	}
	
	

}
