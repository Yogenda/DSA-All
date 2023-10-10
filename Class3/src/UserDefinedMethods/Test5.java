package UserDefinedMethods;

import java.util.Scanner;

public class Test5 {
	/*
	 * ncr = n!/(r!*(n-r)!)
	 * Note : n must be greater to r
	 */
	static long Factorial(int x)
	{
				
		long fact = 1;
		while(x>0)
		{
			fact = fact*x;
			x--;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N, R values ");
		int n = sc.nextInt();
		int r = sc.nextInt();
		if(n>r)
		{
		long ncr =  Factorial(n)/(Factorial(r)*Factorial(n-r));
		System.out.println(n + " C " + r + " = " + ncr);
		}
		else
			System.out.println("N must be greater to R");	
	}
}
