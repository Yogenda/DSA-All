package nestedloops;

public class test {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("----------------------");
		int n=4;
		for (int i = 0; i <= n; i++) {
			// outer loop
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
