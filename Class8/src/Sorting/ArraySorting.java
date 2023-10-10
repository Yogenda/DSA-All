package Sorting;

public class ArraySorting {

	public static void main(String[] args) {

		int x[] = { 10, 4, 5, 1, 8 };

		System.out.println("Actual Values ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		// sorting for asending order
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp; // 
				}
			}
		}

		System.out.println("\nSorting Values in Asending Order ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}

		// sorting for desending order
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] < x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		System.out.println("\nSorting Values desending order ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
	}

}
