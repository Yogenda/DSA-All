package TestPack;

//Example of Unary Operators 

public class Program6 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("X value is : " + x);
		++x; // (++x) x = x+1;
		System.out.println("X value is : " + x);
		System.out.println("------------------");
		int y = 10;
		System.out.println("Y value is : " + y);
		--y; // (--y) y = y-1;
		System.out.println("Y value is : " + y);

		System.out.println("---------Pre Increment---------");
		int n = 10;
		System.out.println("N value : " + n);
		int m = ++n;
		System.out.println("N : " + n + "\tM : " + m);

		System.out.println("---------Post Increment---------");
		n = 10;
		System.out.println("N value : " + n);
		m = n++;
		System.out.println("N : " + n + "\tM : " + m);
	}
}
