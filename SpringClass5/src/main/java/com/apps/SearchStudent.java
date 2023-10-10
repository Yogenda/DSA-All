package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Student;
import com.service.StudentService;


public class SearchStudent {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("dbConfig.xml");
		
		StudentService  ss = (StudentService)app.getBean("ssObj");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number");
		int rno = sc.nextInt();
		
		Student std = ss.SearchStudent(rno);
		
		if(std!=null)
		{
			System.out.println(std.getRollno() + "\t" + std.getSname() + "\t" + std.getCourse() + "\t" + std.getFees());
		}
		else
			System.out.println("Student Not Found");
	}
}
