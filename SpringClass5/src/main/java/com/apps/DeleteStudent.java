package com.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Student;
import com.service.StudentService;


public class DeleteStudent {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("dbConfig.xml");
		
		StudentService  ss = (StudentService)app.getBean("ssObj");
		
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll Number");
		int rno = sc.nextInt();
		
		std = ss.SearchStudent(rno);
		
		if(std!=null)
		{
			System.out.println(std.getRollno() + "\t" + std.getSname() + "\t" + std.getCourse() + "\t" + std.getFees());
			System.out.println("Are U Sure to Delete (y/n)");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("Y"))
				System.out.println(ss.DeleteStudent(rno));
		}
		else
			System.out.println("Student Not Found");
	}
}
