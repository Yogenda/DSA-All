package Class_2;

import java.util.*;

//Better solution.
public class Class_1_Program3_GoogleIV_BetterSolu {
	public static boolean hasPairWithSum(int[] arr, int sum) {
		Set<Integer> seenNumbers = new HashSet<>();

		for (int num : arr) {
			if (seenNumbers.contains(num)) {
				return true;
			}

			seenNumbers.add(sum - num);
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
