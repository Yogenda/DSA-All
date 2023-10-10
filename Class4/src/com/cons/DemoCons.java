package com.cons;

public class DemoCons {
	private int x, y;
	
	public DemoCons() {
		System.out.println("It is a constructor");
		x=10;
		y=20;
	}
	
	public void PrintValues() {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of X is: "+y);
	}
}
