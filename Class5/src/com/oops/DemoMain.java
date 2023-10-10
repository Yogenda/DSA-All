package com.oops;

class Demo1
{
	public void get()
	{
		System.out.println("This is get() method from PArent class");
	}
}

class Demo2 extends Demo1
{
	public void get()
	{
		System.out.println("This is get() method from child class");
	}	
}




public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 dparent = new Demo1();
		dparent.get();// calls parent class method
		Demo2 dchild = new Demo2();
		dparent = dchild; // overriding
		// or
//		dparent = new Demo2();
		dparent.get();  // calls child class method
	}

}
