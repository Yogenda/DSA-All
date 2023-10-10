package com.apps;

import java.util.Scanner;
import com.cons.StdInfo;
public class StdInfoApp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID : " );
		int sid = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sname = sc.next();
		System.out.println("Enter Studnet Location : ");
		String loc = sc.next();
		while(true)
		{
		System.out.println("Whether the student is from NIT(Yes/No)");
		String ch = sc.next();
		if(ch.equals("Yes") || ch.equals("No"))
		{
			StdInfo  std = null;
			switch(ch)
			{
			case "Yes":	
				std = new StdInfo(sid,sname,loc);
				break;
			case "No":
				System.out.println("College Name : ");
				String clg = sc.next();
				std = new StdInfo(sid,sname,loc, clg);
				break;  
			}
			
			System.out.println("Student ID : " + std.getStudentId());
			System.out.println("Student Name : " + std.getStudentName());
			System.out.println("Student Address : " + std.getStudentAddress());
			System.out.println("College Name : " + std.getCollegeName());
			break; // for stoping loop
		}
		else
			System.out.println("Wrong Input");
		}
	}
}
