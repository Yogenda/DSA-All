package InputPack;
// Accept 3 digit value(100-999), then find indivisual digits
// n = 123
// o/p :-  fd = 1
// sd = 2
// td = 3
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter any 3 digit value(100-999) ");
		int n = scr.nextInt();	
		
		System.out.println("Given Value is : " + n);
		int firstDigit = n/100;
		System.out.println("First Digit : " + firstDigit);
		int secondDigit = (n%100)/10;
		System.out.println("Second Digit : " + secondDigit);
		int lastDigit = (n%100)%10;
		System.out.println("Last Digit : " + lastDigit);
	}
}
