package Third_class;

import java.util.Scanner;

public class Cond3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.next();
		if(str.equalsIgnoreCase("Yogendra")) {
			System.out.println("your are Yogendra");
		}
		else {
			System.out.println("You are not Yogendra");
		}
	}

}
