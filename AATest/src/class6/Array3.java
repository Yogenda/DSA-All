package class6;

//import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a[2][2]);
		System.out.println(a[1][0]);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
