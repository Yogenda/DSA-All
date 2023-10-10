package com.multithreading;

public class ThMain {

	public static void main(String[] args) {
		// using Runnable interface 
		ThreadEx2  te2 =new ThreadEx2();
		Thread t1 =new Thread(te2);
		t1.start();
	
		
		// using Thread class
		ThreadEx1  te1 = new ThreadEx1();//object created for user defined class.
		te1.start(); //Start() method to execute thread.
		
		
		System.out.println("This is Main()");
	}

}
