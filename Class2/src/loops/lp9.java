package loops;

import java.util.Scanner;

public class lp9 {

	public static void main(String[] args) {
		// accept a number then check is it palindrome or not
		//palindrome number :  the number and it's reverse number is same
		// 121 = 121
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = sc.nextInt();
		int temp=n;
		int rev = 0;
		while(n>0)
		{
			int r =n%10;
			rev = rev*10+r;
			n =n/10;
		}
		
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
