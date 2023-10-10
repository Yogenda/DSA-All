package com.Apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Customer;
import com.models.Student;

public class TestApp2 {

	public static void main(String[] args) {
		
		ApplicationContext  app = new ClassPathXmlApplicationContext("Config.xml");
		Customer cust = app.getBean("objCust", Customer.class);
		cust.PrintCustomerInfo();
	}

}
