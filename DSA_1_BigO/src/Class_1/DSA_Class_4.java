package Class_1;

import java.util.*;

public class DSA_Class_4 {
	// lets add lots of array items in the array list. with the same name.
	public static void findNemo(String[] array) { 
		
		long t0 = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            if (array.equals("nemo")) {
                System.out.println("Found Nemo");
            }
        }
        long t1 = System.currentTimeMillis();
        System.out.println("Call to find Nemo took " + (t1 - t0) + " milliseconds");
    }

	public static void main(String[] args) {
		String[] nemo = new String[100000];
		// fill(): Assigns the specified Object reference to each element of the specified array of Objects.
        Arrays.fill(nemo, "nemo");
        findNemo(nemo);
	}

}
