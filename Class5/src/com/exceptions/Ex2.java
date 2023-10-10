package com.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Ex2 {

	public static void main(String[] args) {

		try
		{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two values ");
		int x = scr.nextInt();
		int y = scr.nextInt();
		
		int div = x/y;
		
		System.out.println("Division : " + div);
		}
		
		catch(InputMismatchException im)
		{
			System.out.println("Please enter only numbers(integers)");
		}
		catch(ArithmeticException  ae)
		{
			System.out.println("Value should not divide with zero");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("this is finally block");
		}
	}

}
