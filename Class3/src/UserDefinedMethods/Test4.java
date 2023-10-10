package UserDefinedMethods;

public class Test4 {
	static int Square(int x)  // with arg and with return value
	{
		int sq = x*x;
		return sq;
	}
	
	static int Cube() // without arg and with return value
	{
		int x = 3;
		int cb = x*x*x;
		return cb;
	}
	
	
	public static void main(String[] args) {
		int result = Square(10);
		System.out.println("Square Value is " + result);
		System.out.println("Square Value is : " + Square(5));
		System.out.println("Cube of 3 : " + Cube());
	}
}
