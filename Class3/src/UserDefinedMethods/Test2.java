package UserDefinedMethods;

import java.util.Scanner;

public class Test2 {
	// Accept a value then find the factorial value using
	// without arg and without return value.
	
	static void Factorial()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = sc.nextInt();
		
		int fact = 1;
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		
		System.out.println("Fact Value is : " + fact);
	}
	
	
	
	public static void main(String[] args) {
		Factorial();
	}

}
