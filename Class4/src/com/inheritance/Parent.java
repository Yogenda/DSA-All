package com.inheritance;

public class Parent {
	protected int x, y;

	public void getData(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Child extends Parent {
	private int sum;

	public void putData() {
		sum = x + y;
		System.out.println(sum);
	}
}
