package Applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanPack.Student;

public class TestApp2 {

	public static void main(String[] args) {
		ApplicationContext bean = new ClassPathXmlApplicationContext("Config.xml");
		Student std = (Student)bean.getBean("stdObj");
		
		System.out.println("Roll Number : " + std.getRollno());
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Course : " + std.getCourse());
		System.out.println("Fees " + std.getFees());
	}
}
