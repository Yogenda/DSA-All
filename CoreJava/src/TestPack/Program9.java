package TestPack;

//Type Casting :

public class Program9 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("X value : " + x);
		float y = x;// implicit type conversion
		System.out.println("Y value : " + y);

		float z = 123.999f;
		System.out.println("Z value is : " + z);
		int k = (int) z; // explicit type conversion
		System.out.println("K value is : " + k);

		int c = 65;
		System.out.println("C value : " + c);
		char ch = (char) c;
		System.out.println("CH value : " + ch);
	}
}
