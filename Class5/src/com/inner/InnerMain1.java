package com.inner;

public class InnerMain1 {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.getVal(10);
		Outer.Inner  i1 = o1. new Inner();
		i1.printVal();
	}

}
