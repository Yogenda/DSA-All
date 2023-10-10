package com.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Student;
import com.service.StudentService;


public class UpdateStudentname {

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
			System.out.println("New Name for Student ");
			std.setSname(sc.next());
			System.out.println(ss.UpdateStudentName(std));
		}
		else
			System.out.println("Student Not Found");
		
	}
}
