package UserDefinedMethods;

import java.util.Scanner;

public class Test3 {
	// Accept a value then find the factorial value using
	// with arg and without return value.
	
	static void Factorial(int n)
	{
				
		int fact = 1;
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		
		System.out.println("Fact Value is : " + fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int x = sc.nextInt();
		Factorial(x);
	}

}
