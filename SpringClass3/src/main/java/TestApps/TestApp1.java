package TestApps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Employee;

public class TestApp1 {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("Config.xml");
		
		Employee emp =(Employee)app.getBean("objEmp");
		System.out.println(emp);
		//System.out.println("Employee Number : " + emp.getEmpno());
		//System.out.println("Employee Name : " + emp.getEname());
		//System.out.println("Address : " + emp.getAdrs());
	}

}
