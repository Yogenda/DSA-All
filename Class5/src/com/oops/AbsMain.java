package com.oops;

public class AbsMain {

	public static void main(String[] args) {
		AbsChild a = new AbsChild();
		a.get(20);
		a.putdata();
		a.print(40);
		
		System.out.println("-------------");
		
		MarksSheet  ms = new MarksSheet();
		ms.GetStdInfo("Kiran", "Java");
		ms.GetMarks(45, 67);
		ms.printMarksSheet();
	}

}
