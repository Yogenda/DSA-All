package Class_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Merge the array
public class Class_1_Array3 {

	public static int[] mergeSortedArrays(int[] array1, int[] array2) {
		List<Integer> mergedList = new ArrayList<>();

		int i = 0; // Index for array1
		int j = 0; // Index for array2

		while (i < array1.length || j < array2.length) {
			if (j == array2.length || (i < array1.length && array1[i] < array2[j])) {
				mergedList.add(array1[i]);
				i++;
			} else {
				mergedList.add(array2[j]);
				j++;
			}
		}

		int[] mergedArray = new int[mergedList.size()];
		for (i = 0; i < mergedList.size(); i++) {
			mergedArray[i] = mergedList.get(i);
		}

		return mergedArray;
	}

	public static void main(String[] args) {
		int[] array1 = { 0, 2, 7, 31 };
		int[] array2 = { 3, 4, 6, 30 };
		int[] mergedArray = mergeSortedArrays(array1, array2);

		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
	}

}
