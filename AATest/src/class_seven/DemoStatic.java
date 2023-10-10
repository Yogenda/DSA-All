package class_seven;

public class DemoStatic {

	private static int x, y;
	
	static void getdata() {
		x=100;
		y=200;
	}
	static void putdata() {
		System.out.println("Value of X is: "+ x);
		System.out.println("Value of Y is: "+ y);
		int sum = x+y;
		System.out.println(sum);
	}
}
