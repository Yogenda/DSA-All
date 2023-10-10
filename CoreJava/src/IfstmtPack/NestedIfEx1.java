package IfstmtPack;
// Accept person gender and age, then check marriage eligibilty
// Male,  age>=21 = eligible for marriage
// Female,  age>=18 = eligible for marriage

import java.util.Scanner;
public class NestedIfEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender of the person(Male/Female) : ");
		String gender = sc.next();
		if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))
		{
			System.out.println("Age of the Person : ");
			int age = sc.nextInt();
			
			if(gender.equalsIgnoreCase("Male"))
			{
				if(age>=21)
					System.out.println("Person Eligible for Marriage");
				else
					System.out.println("Person Not Eligible for Marriage");
			}
			else if(gender.equalsIgnoreCase("Female"))
			{			
				if(age>=18)
					System.out.println("Person Eligible for Marriage");
				else
					System.out.println("Person Not Eligible for Marriage");
			}
		}
		else
			System.out.println("Gender not valid");
		
		
		/*
		 * == operator will not work for the strings
		 * here equals() method has to be used for strings
		 * here equalsIgnoreCase() method will string equal or not
		 * without checking case(capital / small)
		 */
		
	}

}
