package loops;

import java.util.Scanner;

public class lp7 {

	public static void main(String[] args) {
		// accept a number then calculate it's factorial value using for loop. 
		//5!= 5x4x3x2x1 = 120
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = sc.nextInt();
		
		int fact = 1;
		
		for(;n>0;n--)
		{
			fact = fact*n;
		}
		/*
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		*/
		System.out.println("Fact Value is : " + fact);
		
	}

}
