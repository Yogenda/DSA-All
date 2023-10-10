package com.exceptions;

import java.io.IOException;

public class Ex5 {

	private int ch;
	public void getdata() throws IOException {
		System.out.println("Enter any character ");
		ch = System.in.read();
	}
	
	public void putdata() {
		System.out.println("Given Character : " + (char)ch);
	}
	
}
