package com.inheritance;

public class DemoParent {
	DemoParent(float x){
		System.out.println("Float Value: "+x);
		System.out.println("Parent class constructor");
	}
}
class DemoChild extends DemoParent{
	DemoChild(int n, float p){
		super(p); //call the parent class constructor
		System.out.println("N value is: "+n);
		System.out.println("Child Class Constructor");
	}
	public void print() {
		System.out.println("child class method");
	}
}