package Arrays;

import java.util.Scanner;

public class Arr2 {
// Accept 5 values, then find sum of array values
	public static void main(String[] args) {
		int x[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + x.length + " Values ");
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		int sum = 0;
		System.out.println("Array Values : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "  ");
			sum = sum+x[i];
		}
		System.out.println("\nSum of array values :  " + sum);
	}
}
