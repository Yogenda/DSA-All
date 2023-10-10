package TestPack;

//Example for Logical Operators

public class Program5 {

	public static void main(String[] args) {
		int x = 10, y = 3, z = 5;
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		System.out.println("Z value is : " + z);

		System.out.println(x + " > " + y + " && " + x + " > " + z + " = " + (x > y && x > z));

		System.out.println(x + " > " + y + " && " + y + " > " + x + " = " + (x > y && y > x));

		System.out.println(x + " > " + y + " || " + y + " > " + x + " = " + (x > y || y > x));

		System.out.println(y + " > " + z + " || " + y + " > " + x + " = " + (y > z || y > x));

		System.out.println("!(" + y + " > " + z + " || " + y + " > " + x + ") = " + !(y > z || y > x));
	}
}
