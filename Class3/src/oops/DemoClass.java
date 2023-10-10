package oops;

public class DemoClass {

	private int x, y;

	public void getdata() {
		x = 100;
		y = 200;
	}

	public void putdata() {
		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);
		int sum = x + y;
		System.out.println("Sum Value : " + sum);
	}
}
