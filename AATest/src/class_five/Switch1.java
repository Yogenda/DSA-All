package class_five;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1,7,8. India \n2. USA \n3. Canada \n4. Pakistan");
		System.out.println("Enter you number for citizenship: ");
		int a = sc.nextInt();

		switch (a) {
		case 1: case 7: case 8:
			System.out.println("You are from India");
			break;
		case 2:
			System.out.println("You are from USA");
			break;
		case 3:
			System.out.println("You are from Canada");
			break;
		case 4:
			System.out.println("You are from pakistan");
			break;
		default:
			System.out.println("YOU ARE FROM ISI");
			break;
		}
	}

}
