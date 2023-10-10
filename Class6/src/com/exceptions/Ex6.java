package com.exceptions;

import java.io.IOException;

public class Ex6 {

	public static void main(String[] args)  {
		try
		{
		System.out.println("Enter any character");
		int ch = System.in.read();

		System.out.println("Given Character : " + (char)ch);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}
