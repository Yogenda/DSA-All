package oops;

import java.util.Scanner;

public class Student {

	private String sname, course;
	private int sub1, sub2;
	private Scanner sc = new Scanner(System.in);
	
	void getStdInfo()
	{
		System.out.println("Student Name and Course : ");
		sname = sc.next();
		course = sc.next();
		
		System.out.println("Two Subject Marks : ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
	}
	void printStdinfo()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Course : " + course) ;
		int total = sub1+sub2;
		System.out.println("Total Marks : " + total);
	}

}
