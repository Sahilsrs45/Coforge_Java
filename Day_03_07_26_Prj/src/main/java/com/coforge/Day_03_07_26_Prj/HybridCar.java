package com.coforge.Day_03_07_26_Prj;

public class HybridCar implements PetrolCar,ElectricCar{
	@Override
	public void provideAc() {
		PetrolCar.super.provideAc();
		ElectricCar.super.provideAc();
		System.out.println("Hybrid car can provide ac in both modes");
		
	}
	
	
	public static void main(String[] args) {
		HybridCar h=new HybridCar();
		h.provideAc();
	}

}
