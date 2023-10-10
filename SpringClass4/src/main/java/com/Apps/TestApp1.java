package com.Apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Student;

public class TestApp1 {

	public static void main(String[] args) {
		
		ApplicationContext  app = new ClassPathXmlApplicationContext("Config.xml");
		Student std1 = (Student)app.getBean("ObjStd");
//		Student std2 = app.getBean("ObjStd", Student.class);
		System.out.println(std1);
	}

}
