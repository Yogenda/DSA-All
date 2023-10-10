package com.inheritance;
//multilevel inheritance

public class StdBiodata {  // parent

	protected String sname, course;
	
	public void GetStdInfo(String sname, String course)
	{
		this.sname = sname;
		this.course = course;
	}
}

class Marks extends StdBiodata  //child 1
{
	protected int sub1, sub2;
	
	public void GetMarks(int sub1, int sub2)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
}

class MarksSheet extends Marks  // child 2
{
	private int total;
	
	public void printMarksSheet()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Course : " + course);
		System.out.println("Sub1 Marks : " + sub1);
		System.out.println("Sub2 Marks : " + sub2);
		total = sub1+sub2;
		System.out.println("Total Marks : " + total);
	}
}