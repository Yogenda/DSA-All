package Class_1;

import java.util.ArrayList;

public class DSA_Class_3 {
	// what if we will add more and more number of items in the array.
	public static void findNemo(ArrayList<String> array) { 
		
        long t0 = System.currentTimeMillis(); //Returns the current time in milliseconds.
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals("nemo")) {
                System.out.println("Found Nemo");
            }
        }
        
        long t1 = System.currentTimeMillis();
        
        System.out.println("Call to find Nemo took " + (t1 - t0) + " milliseconds");
    }

	public static void main(String[] args) {
		ArrayList<String> nemo = new ArrayList<>();
        nemo.add("one");
        nemo.add("two");
        nemo.add("three");
        nemo.add("four");
        nemo.add("five");
        nemo.add("six");
        nemo.add("seven");
        nemo.add("eight");
        nemo.add("nine");
        nemo.add("ten");
        nemo.add("eleven");
        findNemo(nemo);
	}
	//After adding the lots of array items there is no change in the time.

}
