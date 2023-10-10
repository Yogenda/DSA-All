package com.inner;
// Member inner class
public class Outer {
	private int x;
	public void getVal(int x)
	{
		this.x=x;
	}
	class Inner{
		private int sq;
		public void printVal() {
			sq=x*x;
			System.out.println(x+ " Square value = "+sq);
		}
	}
}
