package Class_1;

import java.util.*;
// 
public class DSA_Class_6 {
	
	public static void findNemo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("running");
            if (array[i].equals("nemo")) {
                System.out.println("Found Nemo");
                break; // once i will found the nemo just break the loop to reduce the task.
            }
        }
    }
	public static void main(String[] args) {
		String[] nemo = { "test", "nemo","two", "three", "four"};
        findNemo(nemo);
	}

}