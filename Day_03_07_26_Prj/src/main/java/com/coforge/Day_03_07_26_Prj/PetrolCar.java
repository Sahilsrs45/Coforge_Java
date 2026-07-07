package com.coforge.Day_03_07_26_Prj;

public interface PetrolCar {
	public default void provideAc() {
		System.out.println("Petrol car provides Normal ac minimal");
	}

}
