package IfstmtPack;
// Accept a value, then check that number even / odd 
// n = 4 ==>  n%2 == 0  even
// n = 3 ==>  n%2 != 0  odd

import java.util.Scanner;
public class SimpleIfEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = sc.nextInt();
		
		if(n%2==0)
			System.out.println("Even number");
	
		if(n%2!=0)
			System.out.println("Odd number");
		
		
		
	}

}
