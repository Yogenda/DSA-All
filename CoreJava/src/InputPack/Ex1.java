package InputPack;
// Accept a value, then find square and cube of that value. 
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter any value ");
		int n = scr.nextInt();
		
		System.out.println("Given Value is : " + n);
		System.out.println(n + " Square Value is : " + (n*n));
		System.out.println(n + " Cube Value is : " + (n*n*n));
	}
}
