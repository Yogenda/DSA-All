package Class_4;

import java.util.ArrayList;
import java.util.Scanner;
// Reverse of a input string.
public class Class_1_Array2 {
	public static String reverse(String str) {
        // Check input
        if (str == null || str.length() < 2 || !str.getClass().equals(String.class)) {
            return "hmm that is not good";
        }
        
        char[] backwards = new char[str.length()];
        int totalItems = str.length() - 1;
        
        for (int i = totalItems; i >= 0; i--) {
            backwards[totalItems - i] = str.charAt(i);
        }
        String reversed = new String(backwards);
        return reversed;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String input = user;
        String reversed = reverse(input);
        System.out.println(reversed);
	}

}
