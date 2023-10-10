package loops;

import java.util.Scanner;

public class lp11 {
	public static boolean isPalindrome(int num) {
		int initNum = num;
		int revNum = 0;
		while (num > 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		return initNum == revNum;
	}

	public static void main(String[] args) {
		System.out.println("Palendrome numbers between 1 to 1000");
		for (int i = 1; i <= 1000; i++) {
			if (isPalindrome(i)) {
				System.out.println(i + " ");
			}
		}
	}

}
