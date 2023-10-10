package com.cons;

public class MultiCons {
	private int x,y;
	public MultiCons() {
		System.out.println("it is a cons witout parama");
		x=10;
		y=20;
	}
	public MultiCons(int x, int y) {
		System.out.println("it is a cons with parama");
		this.x=x;
		this.y=y;
	}
	public void PrintValues() {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of Y is: "+y);
	}
}
