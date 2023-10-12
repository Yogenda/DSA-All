package Class_1;

import java.util.*;
//1, 1 | 1,2|1,3|1, 4|1, 5|2, 1.......etc
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
