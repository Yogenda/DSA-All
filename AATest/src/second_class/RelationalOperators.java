package second_class;

public class RelationalOperators {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		boolean c=a>b;
		System.out.println("greater "+ c);
		c=a>=b;
		//or
		System.out.println("greater equals " + (a>=b));
		c=a<b;
		System.out.println("less "+ c);
		c=a<=b;
		System.out.println("less equals " + c);
		c=a==b;
		System.out.println("equals "+ c);
		c=a!=b;
		System.out.println("not equal "+c);		
		
	}

}
