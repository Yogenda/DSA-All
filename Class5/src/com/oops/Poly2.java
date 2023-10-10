package com.oops;

public class Poly2 {

	// method overloading: find the big number from two values
	void Big(int x, int y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number " + x);
		else
			System.out.println(x + " and " + y + " Big Number " + y);
	}
	
	void Big(float x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number " + x);
		else
			System.out.println(x + " and " + y + " Big Number " + y);
	}
	
	void Big(int x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number " + x);
		else
			System.out.println(x + " and " + y + " Big Number " + y);
	}
	
	
	public static void main(String[] args) {
		Poly2  p = new Poly2();
		p.Big(10, 20);
		p.Big(12.34f, 10.56f);
		p.Big(12, 10.4f);
	}

}
