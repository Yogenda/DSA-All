package com.apps;

import java.util.Scanner;
import com.cons.StdInfo;

public class StdInfoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Studnet ID: ");
		int sid = sc.nextInt();
		System.out.println("Studnet Name: ");
		String sname = sc.next();
		System.out.println("Student Location: ");
		String loc= sc.next();
		
		System.out.println("NIT studnet Yes/No: ");
		String ch = sc.next();
		if(ch.equals("Yes")||ch.equals("No")) {
			if(ch.equals("Yes")) {
				StdInfo std1 = new StdInfo(sid, sname, loc);
				System.out.println("Student ID : " + std1.getStudentId());
				System.out.println("Student Name : " + std1.getStudentName());
				System.out.println("Student Address : " + std1.getStudentAddress());
				System.out.println("College Name : " + std1.getCollegeName());
			}
			else {
				System.out.println("College Name : ");
				String clg = sc.next();
				StdInfo std2 = new StdInfo(sid, sname, loc, clg);
				System.out.println("Student ID : " + std2.getStudentId());
				System.out.println("Student Name : " + std2.getStudentName());
				System.out.println("Student Address : " + std2.getStudentAddress());
				System.out.println("College Name : " + std2.getCollegeName());
			}
		}
		else
			System.out.println("Wrong Input");
	}

}
