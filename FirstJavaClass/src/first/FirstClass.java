package first;

public class FirstClass {
	public static void main(String args[]) {
		// arthmathic operators
		int a = 7;
		int b = 10;
		// addition of a : 7 and b: 10 is = 17
		System.out.println("Addition of A: " + a + " and of B: " + b + " is = " + (a + b));
		System.out.println("Subtraction of A: "+ a + " and of B: " + b + " is = " + (a-b));
		System.out.println("Multiplication of A: "+ a + " and of B: " + b + " is = " + (a*b));
		System.out.println("Division of A: "+ a + " and of B: " + b + " is = " + (a/b));
		System.out.println("Remainder of A: "+ a + " and of B: " + b + " is = " + (a%b));

		// relational operators
		System.out.println("Value of A: "+ a + " and of B: " + b + " as B greater than A = " + (a<b));
		System.out.println("Value of A: "+ a + " and of B: " + b + " as B lesser than A = " + (a>b));
		System.out.println("Value of A: "+ a + " and of B: " + b + " as B equal to  A = " + (a==b));
		System.out.println("Value of A: "+ a + " and of B: " + b + " as B is not equal to A = " + (a!=b));

		// logical operators
		System.out.println("Value of A:"+ a + " is greater than B: " + b+"Value of B is greater than A" +((a>b) && (b<a)));
		System.out.println((a == b) || (b > a));
		System.out.println(a != b);
	}
}
