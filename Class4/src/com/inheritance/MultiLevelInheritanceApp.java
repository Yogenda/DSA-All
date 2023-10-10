package com.inheritance;

public class MultiLevelInheritanceApp {

	public static void main(String[] args) {
		MarksSheet m  = new MarksSheet();
		m.GetStdInfo("Pavan", "Java");
		m.GetMarks(56, 67);
		m.printMarksSheet();
	}

}
