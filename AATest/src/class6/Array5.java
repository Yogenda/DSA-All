package class6;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]= new int[2][];
		a[0]=new int[3];
		a[1]=new int[4];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
