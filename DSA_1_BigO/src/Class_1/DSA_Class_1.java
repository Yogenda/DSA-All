package Class_1;

import java.util.ArrayList;

public class DSA_Class_1 {
	
	public static void findNemo(ArrayList<String> array) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).equals("nemo")) {
				System.out.println("Found Nemo");
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> nemo = new ArrayList<>();
		nemo.add("nemo");
		findNemo(nemo);
	}

}
