package Class_2;

import java.util.*;

public class Class_1_Program2 {
	public static boolean containsCommonItem(String[] arr1, String[] arr2) {
        for (String item1 : arr1) {
            for (String item2 : arr2) {
                if (item1.equals(item2)) {
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		String[] arr1 = {"a", "b", "c", "x"};
        String[] arr2 = {"z", "y", "i"};

        boolean commonItem = containsCommonItem(arr1, arr2);
        System.out.println("Contains a common item: " + commonItem);
	}

}
