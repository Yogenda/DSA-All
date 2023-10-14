package Class_2;

import java.util.*;

public class Class_1_Program {

	public static boolean containsCommonItem(String[] arr1, String[] arr2) {
        // Create a set to store items from the first array
        Set<String> set = new HashSet<>();

        // Populate the set with items from the first array
        for (String item : arr1) {
            set.add(item);
        }

        // Check if any item in the second array exists in the set
        for (String item : arr2) {
            if (set.contains(item)) {
                return true;
            }
        }

        // No common item found
        return false;
    }
	
	public static void main(String[] args) {
		String[] arr1 = {"a", "b", "c", "x"};
        String[] arr2 = {"z", "y", "i"};

        boolean hasCommonItem = containsCommonItem(arr1, arr2);

        System.out.println("Contains Common Item: " + hasCommonItem);

	}

}
