package class_seven;

public class DemoClass {

	private int x, y;
	
	void getdata() {
		x=100;
		y=200;
	}
	void putdata() {
		System.out.println("Value of X is: "+ x);
		System.out.println("Value of Y is: "+ y);
		int sum = x+y;
		System.out.println(sum);
	}
}
