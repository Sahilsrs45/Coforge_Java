package com.coforge.Day_03_07_26_Prj;

public class CarMain {
	public static void main(String[] args) {
		Car c=new BMW();
		c.start();
		c.stop();
		c.provideAC();
		Car.musicSystem();
		
		
		System.out.println("\nFor Honda ");
		Car c2=new Honda();
		c2.start();
		c2.stop();
		c2.provideAC();
		Car.musicSystem();
	}

}
