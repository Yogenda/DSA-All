package Class_1;

import java.util.*;

public class DSA_Class_6_3 {
	public static void logAllPairsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
	public static void main(String[] args) {
		int[] boxes = {1, 2, 3, 4, 5};
        logAllPairsOfArray(boxes);
	}

}
