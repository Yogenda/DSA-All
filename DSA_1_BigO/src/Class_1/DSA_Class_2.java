package Class_1;

import java.util.ArrayList;

public class DSA_Class_2 {
	// new lets calculate the time it took to run the array.
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
		nemo.add("nemo");
		findNemo(nemo);
	}

}
