package Class_2;

import java.util.*;

//Naive solution.
public class Class_1_Program3_GoogleIV {
	public static boolean hasPairWithSum(int[] arr, int sum) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 9;

		boolean hasPair = hasPairWithSum(arr, sum);
		System.out.println("Has pair with sum: " + hasPair);
	}

}
