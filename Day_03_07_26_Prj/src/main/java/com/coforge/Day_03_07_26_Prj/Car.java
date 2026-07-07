package com.coforge.Day_03_07_26_Prj;

public interface Car {
	public void start();
	public void stop();
	public  default void provideAC() {
		System.out.println("AC can be enabled as  needed ");
	}
	
	public static void musicSystem() {
		System.out.println("MUsic sytem is provided");
	}

}
