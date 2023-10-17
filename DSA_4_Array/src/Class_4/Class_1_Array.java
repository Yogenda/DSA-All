package Class_4;

import java.util.ArrayList;

public class Class_1_Array {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");

		// Access an element by index
		String element = strings.get(2);
		System.out.println(element);
		System.out.println(strings);

		// Add an element at the end
		strings.add("e"); //O(1)
		System.out.println(strings);

		// Remove an element from the end
		strings.remove(strings.size() - 1); //O(1)
		System.out.println(strings);

		// Add an element at the beginning
		strings.add(0, "x"); //O(n)
		System.out.println(strings);

		// Insert an element at a specific index
		strings.add(2, "alien"); //O(n)

		// Print the ArrayList
		System.out.println(strings);
	}

}
