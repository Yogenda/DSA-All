package com.inner;
// Local inner class
public class Outer2 {
private int x;
	
	public void getVal(int x)
	{
		this.x = x;
	}
	public void display()
	{
		class Inner2
		{
			private int sq;
			
			public void printVal()
			{
				sq = x*x;
				System.out.println(x + " Square Value " + sq);
			}
		}
		
		//-- object creation and calling methods
		
		Inner2 i2 = new Inner2();
		i2.printVal();
		
	}
}
