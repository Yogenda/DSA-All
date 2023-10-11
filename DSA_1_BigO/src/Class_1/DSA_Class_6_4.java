package Class_1;

import java.util.*;

public class DSA_Class_6_4 {
	//1+1 | 1+2 | 1+3 | 1+4 | 1+5 | 2+1 | 2+2 | 2+3 .....etc 
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4);

        System.out.println("These are the numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("And these are their sums:");
        for (int firstNumber : numbers) {
            System.out.println(firstNumber);
            for (int secondNumber : numbers) {
                System.out.println(firstNumber + secondNumber);
            }
        }
	}

}
