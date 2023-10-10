package class_seven;

public class Test2 {
//	with arg and with return type
	static int Square(int x) {
		int sqr=x*x;
		return sqr;
	}

//	without arg and with return type
	static int cub() {
		int x=5;
		int cb=x*x*x;
		return cb;
	}
	public static void main(String[] args) {
		System.out.println(Square(5));
		System.out.println(cub());
	}

}
