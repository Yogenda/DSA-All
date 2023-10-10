package loops;

import java.util.Scanner;

public class lp4 {

	public static void main(String[] args) {
		// accept a number then check is it prime or not.
		//prime number :  the number has no factors except 1 and itself.
		// 5:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int n = sc.nextInt();
		
		int count = 0;
		
		int i = 1;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			
			i++;
		}
		
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
