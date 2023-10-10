package com.manipulations;

import java.util.Scanner;
import com.cons.Student;

public class StudentActions {
	private Student std = new Student();
	private Scanner sc = new Scanner(System.in);
	
	public void getStdDetails() {
		System.out.println("Roll Number: ");
		std.setRollno(sc.nextInt());
		System.out.println("Student Name : ");
		std.setSname(sc.next());
		System.out.println("Course ");
		std.setCourse(sc.next());
		System.out.println("Course Fees ");
		std.setFees(sc.nextFloat());
	}
	public void printstdDetails() {
		System.out.println("Roll Number: "+std.getRollno());
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Course : " + std.getCourse());
		System.out.println("Course Fees : " + std.getFees());
	}
}
