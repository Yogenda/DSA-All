package com.apps;

import com.cons.DemoCons;

public class ConsApp1 {

	//A constructor in Java is a special method that 
	//is used to initialize objects. 
	//The constructor is called when an object 
	//of a class is created. 
	//It can be used to set initial values for object 
	//attributes:
	
	public static void main(String[] args) {
		DemoCons dc1 = new DemoCons();
		dc1.PrintValues();
		
		DemoCons dc2 = new DemoCons();
		dc2.PrintValues();
	}
	
}
