package com.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Student;
import com.service.StudentService;


public class AddNewStudent {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("dbConfig.xml");
		
		StudentService  ss = (StudentService) app.getBean("ssObj");
		
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Name ");
		std.setSname(sc.next());
		System.out.println("Course name ");
		std.setCourse(sc.next()); 
		System.out.println("Course Fees ");
		std.setFees(sc.nextFloat());
		
		System.out.println(ss.AddNewStudent(std));
		
	}

}
