package com.coforge.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("man")
public class Manufacture {
	//@Value("456")
	@Value("${Manufacture.mid}")
	private int mid;
	//@Value("Coforge")
	@Value("${Manufacture.company}")
	private String company;
	//@Value("Pune")
	@Value("${Manufacture.address}")
	private String address;
	
	public Manufacture() {
		// TODO Auto-generated constructor stub
	}

	public Manufacture(int mid, String company, String address) {
		super();
		this.mid = mid;
		this.company = company;
		this.address = address;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Manufacture [mid=" + mid + ", company=" + company + ", address=" + address + "]";
	}
	

}
