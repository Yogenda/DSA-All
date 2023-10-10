package com.inner;
// Static inner class
public class Outer3 {
	private static int x;

	public static void GetVal(int n)
	{
		x = n;
	}

	static class Inner3 
	{
		private int sq;
		
		public void Square()
		{
			sq = x*x;
			System.out.println(x + " Square Value " + sq);
		}
		
		public static void Cube()
		{
			System.out.println(x + " Cube Value " + (x*x*x));
		}
	}
}
