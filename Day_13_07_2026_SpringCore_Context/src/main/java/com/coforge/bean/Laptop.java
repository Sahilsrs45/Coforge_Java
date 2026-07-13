package com.coforge.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("lap")
public class Laptop {
	//@Value("Dell")
	@Value("${Laptop.brand}")
	private String brand;
	//@Value("89792")
	@Value("${Laptop.price}")
	private double price;
	//@Value("12gb")
	@Value("${Laptop.ramCapacity}")
	private String ramCapacity;
	//@Value("1tb")
	@Value("${Laptop.hardDiskCapacity}")
	private String hardDiskCapacity;
	//@Value("256gb")
	@Value("${Laptop.ssdCapacity}")
	private String ssdCapacity;
	//@Value("black")
	@Value("${Laptop.color}")
	private String color;
	//@Autowired
	private Manufacture manufacture;
	
	
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}



	public Laptop(String brand, double price, String ramCapacity, String hardDiskCapacity, String ssdCapacity,
			String color, Manufacture manufacture) {
		super();
		this.brand = brand;
		this.price = price;
		this.ramCapacity = ramCapacity;
		this.hardDiskCapacity = hardDiskCapacity;
		this.ssdCapacity = ssdCapacity;
		this.color = color;
		this.manufacture = manufacture;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getRamCapacity() {
		return ramCapacity;
	}



	public void setRamCapacity(String ramCapacity) {
		this.ramCapacity = ramCapacity;
	}



	public String getHardDiskCapacity() {
		return hardDiskCapacity;
	}



	public void setHardDiskCapacity(String hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}



	public String getSsdCapacity() {
		return ssdCapacity;
	}



	public void setSsdCapacity(String ssdCapacity) {
		this.ssdCapacity = ssdCapacity;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Manufacture getManufacture() {
		return manufacture;
	}



	public void setManufacture(Manufacture manufacture) {
		this.manufacture = manufacture;
	}



	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ramCapacity=" + ramCapacity + ", hardDiskCapacity="
				+ hardDiskCapacity + ", ssdCapacity=" + ssdCapacity + ", color=" + color + ", manufacture="
				+ manufacture + "]";
	}


	
	

}
