package com.exceptions;

import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter any character");
		int ch = System.in.read();

		System.out.println("Given Character : " +(char)ch);
	}
}
