package UserDefinedMethods;

public class Test1 {
	static void Sample() // without arg and without return value
	{
		System.out.println("This is User Defined Method");
	}

	static void Simple(int x, int y) // with arg and without return value
	{
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	public static void main(String[] args) {
		Sample();
		System.out.println("this is main method");
		Simple(10, 20);
		Simple(120, 340);
	}
}
