package Class_1;

import java.util.*;

public class DSA_Class_6_1 {
	public static void printFirstItemThenFirstHalfThenSayHi100Times(int[] items) {
		if (items.length > 0) {
			System.out.println(items[0]); // O(1)
			int middleIndex = items.length / 2;
			int index = 0;
			while (index < middleIndex) {
				System.out.println(items[index]);
				index++;
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("hi");
		}
	}

	public static void main(String[] args) {
		int[] items = { /* Your array of items */ };
		printFirstItemThenFirstHalfThenSayHi100Times(items);
	}

}

//Big O(1 + n/2 + 100)
//Big O(n/2 + 101)
//Big O(n + 1)
//Big O(n)
