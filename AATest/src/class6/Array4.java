package class6;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		int a[][]= new int[1][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array values");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("----------------------");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
