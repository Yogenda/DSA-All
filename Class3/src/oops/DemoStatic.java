package oops;

public class DemoStatic {

	private static int x, y;
	
	static void getdata()
	{
		x = 100; 
		y = 200;
	}
	
	static void putdata()
	{
		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);
		int sum = x+y;
		System.out.println("Sum Value : " + sum);
	}
}
