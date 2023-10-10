package swtpack;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. India\n2. USA\n3. Canada");
		System.out.println("Pick your country code");
		
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("u r having indian citizenship");
			break;
		case 2:
			System.out.println("u r having american citizenship");
			break;
		case 3:
			System.out.println("u r having canada citizenship");
			break;
		default:
			System.out.println("Invalid Option");
		}
//System.out.println("Out of Switch");
	}

}
