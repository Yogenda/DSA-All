package com.cons;

public class ConsParam {
	private int x, y;

	public ConsParam(int x, int y) {
		System.out.println("This is construcore with parameter");
		this.x = x;
		this.y = y;
	}
	
	public void PrintValues() {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of Y is: "+y);
	}
}
