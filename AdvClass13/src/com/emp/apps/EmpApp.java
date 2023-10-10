package com.emp.apps;

import java.util.List;
import java.util.Scanner;

import com.emp.dmls.EmpOperations;
import com.emp.model.Employee;

public class EmpApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpOperations eo = new EmpOperations();
		while(true)
		{
			System.out.println("1. Add New Emloyee\n2. View All Emps\n3. Search An Emp\n4. Exit");
			System.out.println("Select An Option ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				Employee emp = new Employee();
				System.out.println("Employee Name ");
				emp.setEname(sc.next());
				System.out.println("Employee Job ");
				emp.setJob(sc.next());
				System.out.println("Employee Salary ");
				emp.setSal(sc.nextFloat());
				eo.AddNewEmp(emp);
				break;
			case 2:
				List<Employee> empall = eo.ShowAll();
				for(Employee e : empall)
				{
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Employee Number : ");
				int eno = sc.nextInt();
				Employee em = eo.SearchEmp(eno);
				if(em!=null)
					System.out.println(em);
				else
					System.out.println("Employee Not Found");
				break;
			case 4:
				System.out.println("Thanks for Using App");
				System.exit(0);
			}
		}
	}

}
