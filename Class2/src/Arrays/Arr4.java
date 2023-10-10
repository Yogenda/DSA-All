package Arrays;

import java.util.Scanner;

public class Arr4 {
// accept set of values in 3x3 matrix then find sum of diagonal elements
	public static void main(String[] args) {
		int x[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 9 Values ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		System.out.println("Array Values : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j] + "  ");
				if(i==j)
					sum = sum+x[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Sum of Diagonal Elements : " + sum);
	}
}
