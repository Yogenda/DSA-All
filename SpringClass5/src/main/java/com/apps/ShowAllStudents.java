package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Student;
import com.service.StudentService;


public class ShowAllStudents {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("dbConfig.xml");
		
		StudentService  ss = (StudentService)app.getBean("ssObj");	
		
		List<Student> showall = ss.ShowAll();
		
		for(Student s: showall)
		{
			System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
		}
	}

}
