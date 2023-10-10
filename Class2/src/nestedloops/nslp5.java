package nestedloops;

public class nslp5 {

	public static void main(String[] args) {
		// print all prime numbers b/w 1-100

		for (int n = 1; n <= 100; n++) {
			int count = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}

			if (count == 2)
				System.out.print(n + "  ");
		}
	}

}
