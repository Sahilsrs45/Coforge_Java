package com.coforge.Day_07_07_2026;

import java.io.Closeable;
import java.io.IOException;

public class LoginSession implements Closeable{
	
	public void login() {
		System.out.println("User logged in");
		
	}
	
	public void accessPages() {
		System.out.println("User acccessing pages");
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Session Completed automatically");
		
	}

	
	
	
	
}
