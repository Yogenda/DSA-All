package class_seven;

public class Test1 {
	
	static void Sample() { //without arag and no return type
		System.out.println("Name Yogendra");	
	}
	// with arg and without return type.
	static void Simple(int x, int y) {
		System.out.println("Value of x: "+ x);
		System.out.println("Value of Y: "+ y);
	}
	public static void main(String[] args) {
		Sample();
		Simple(10, 20);
		Simple(40, 50);
	}

}
