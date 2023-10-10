package com.Apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Customer;
import com.models.Employee;
import com.models.Student;

public class TestApp3 {

	public static void main(String[] args) {
		
		ApplicationContext  app = new ClassPathXmlApplicationContext("EmpConfig.xml");
		Employee emp = app.getBean("objEmp", Employee.class);
		
		System.out.println("Emp Name : " + emp.getEname());
		System.out.println("Account Number : " + emp.getAccount().getAcno());
		System.out.println("Type of Account : " + emp.getAccount().getActype());
	}

}
