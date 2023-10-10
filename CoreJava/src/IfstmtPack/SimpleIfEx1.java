package IfstmtPack;
// Accept a value, then check that number is +ve / -ve number
// n = 5  n>0  +ve
// n = -7 n<0  -ve
import java.util.Scanner;
public class SimpleIfEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = sc.nextInt();
		
		if(n>0)
		{
			System.out.println("+ve number");
		}

		if(n<0)
		{
			System.out.println("-ve number");
		}
		
		if(n==0)
		{
			System.out.println("Value is Zero");
		}
	}

}
