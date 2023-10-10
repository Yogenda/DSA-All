package com.inner;

public class InnerMain3 {

	public static void main(String[] args) {
		Outer3.GetVal(10);
	
		Outer3.Inner3 i3 = new Outer3.Inner3();
		i3.Square(); // calling non-static of inner class.
		Outer3.Inner3.Cube(); // calling static method of inner class
	}

}
