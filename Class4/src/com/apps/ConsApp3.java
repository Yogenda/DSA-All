package com.apps;

import com.cons.MultiCons;

public class ConsApp3 {

	public static void main(String[] args) {
		MultiCons mc1 = new MultiCons();
		mc1.PrintValues();
		
		MultiCons mc2 = new MultiCons(50, 70);
		mc2.PrintValues();
	}

}
