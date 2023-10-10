package TestApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Employee;
import Beans.Student;

public class TestApp2 {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("Config.xml");
		
		Student std = (Student)app.getBean("ObjStd");
		
		//System.out.println(std);  // it calls toString() method
		
		System.out.println("Roll Number " + std.getRollno());
		System.out.println("Student Name " + std.getSname());
		System.out.println("Qualifications " + std.getQualifications());
		System.out.println("Courses " + std.getCourses());
		System.out.println("Course and Faculty " + std.getCourse_faculty());
	}

}
