package com.coforge.Day_07_07_2026;

import java.io.IOException;

public class TryWithResourceDemo {
	
	public static void main(String[] args) {
		
		try(Printer printer =new Printer()){
			printer.usePrinter();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
