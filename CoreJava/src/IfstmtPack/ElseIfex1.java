package IfstmtPack;
// Accept 3 values, then check big number 
// x = 10, y = 4, z = 5
// x>y && x>z = x is big
// y>x && y>z =  y is big
// z>x && z>y = z is big
import java.util.Scanner;
public class ElseIfex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 values : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y && x>z)
			System.out.println(x + " is big Number");
		else if(y>x && y>z)
			System.out.println(y + " is big Number");
		else if(z>x && z>y)
			System.out.println(z + " is big Number");
		else
			System.out.println("Any two / all values are same");
	}

}
