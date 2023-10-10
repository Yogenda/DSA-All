package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		try {
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter two values ");
			int x = scr.nextInt();
			int y = scr.nextInt();

			int div = x / y;

			System.out.println("Division : " + div);
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
//			System.out.println("Value should not divide with zero");
		}
		finally
		{
			System.out.println("this is finally block");
		}
	}

}
