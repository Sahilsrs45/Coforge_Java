package com.coforge.Day_07_07_2026;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
	
	public static void readFile() {
		
		
	}
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		File f=new File("demo.txt");
		
		Scanner sc=new Scanner(f);
		System.out.println(sc.nextLine());
	}

}
