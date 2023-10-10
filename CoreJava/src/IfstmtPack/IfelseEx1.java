package IfstmtPack;
// Accept two values, then check big number 
// x = 10, y = 4
// x>y  "x is big"  else "y is big" 
import java.util.Scanner;
public class IfelseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>y)
			System.out.println(x + " number is big");
		else
			System.out.println(y + " number is big");
	}

}
