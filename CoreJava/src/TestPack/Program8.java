package TestPack;

//Example of Conditional Operators

public class Program8 {

	public static void main(String[] args) {
		int x = 10, y = 5;

		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		//var_declaration = condition ? true_value : false_value;
				//cond   true //false
		int big = (x > y) ? x : y;

		System.out.println("Big Value is : " + big);
	}
}
