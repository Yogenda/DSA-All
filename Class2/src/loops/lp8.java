package loops;

import java.util.Scanner;

public class lp8 {

	public static void main(String[] args) {
		// accept a number then check is it prime or not.
		//prime number :  the number has no factors except 1 and itself.
		// 5:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
