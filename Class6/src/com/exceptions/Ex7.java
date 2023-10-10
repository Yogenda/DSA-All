package com.exceptions;

import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter age of the person");
			int age = sc.nextInt();
			if(age<18) {
				throw new InvalidAgeException("Persone age is below 18");
			}
			else {
				System.out.println("Voter details registered");
			}
		}catch(InvalidAgeException iae) {
			System.out.println(iae.getMessage());
			
		}
	}

}
