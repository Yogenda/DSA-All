package Third_class;

import java.util.Scanner;

public class NestCond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Gender: ");
		String gender=sc.next();
		if((gender.equalsIgnoreCase("Male"))||(gender.equalsIgnoreCase("Female"))){
			if(gender.equalsIgnoreCase("Male")) {
				System.out.println("Enter your age:");
				int age=sc.nextInt();
				if(age>=23) {
					System.out.println("Your are eligible for marrige.");
				}
				else {
					System.out.println("Not eligible for marriage");
				}
			}
			if(gender.equalsIgnoreCase("Female")) {
				System.out.println("Enter your age:");
				int age=sc.nextInt();
				if(age>=20) {
					System.out.println("Your are eligible for marrige.");
				}
				else {
					System.out.println("Not eligible for marriage");
				}
			}
		}
		else {
			System.out.println("Others");
		}
	}

}
