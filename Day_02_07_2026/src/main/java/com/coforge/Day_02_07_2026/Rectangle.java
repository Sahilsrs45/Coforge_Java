package com.coforge.Day_02_07_2026;


public class Rectangle extends Shape{
	private double l;
	private double b;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle with lenght "+l +" & breadth "+ b +" is : "+l*b);
		
	}
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle with lenght "+l +" & breadth "+ b +" is : "+2*(l+b));
		
	}
	
	

}