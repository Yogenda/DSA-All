package class6;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[4];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);;
		}
	}

}
