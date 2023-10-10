package com.jdbc.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.models.Dept;
import com.jdbc.models.EmpDept;
import com.jdbc.models.Employee;
import com.jdbc.service.EmpDeptService;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("DbConfig.xml");
		EmpDeptService  emp = (EmpDeptService)app.getBean("empObj");
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("1. All Emps with Dept Names\n2. All Departments\n3. All Employees\n4. Exit");
			System.out.println("Select Ur Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				List<EmpDept>  eall = emp.ShowAllWithDeptName();
				
				for(EmpDept e : eall)
				{
					System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getDeptname());
				}
				break;
			case 2:
				List<Employee>  empall = emp.ShowAllEmps();
				for(Employee e : empall)
				{
					System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getJob() + "\t" + e.getSal());
				}
				break;
			case 3:
				List<Dept>  dall = emp.ShwoAllDepts();
				
				for(Dept d: dall)
				{
					System.out.println(d.getDeptno() + "\t" + d.getDeptname() + "\t" + d.getLoc());
				}
				break;
			case 4:
				System.out.println("Thanks for using this app");
				System.exit(0);
			}
			System.out.println("---------------------");
		}
	}
}
