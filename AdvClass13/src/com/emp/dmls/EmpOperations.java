package com.emp.dmls;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.emp.connection.GetConnection;
import com.emp.model.Employee;

public class EmpOperations {
	
	SessionFactory sf = null;
	public EmpOperations()
	{
		sf = GetConnection.Connection();
	}
	
	public void AddNewEmp(Employee emp)
	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp);
		tr.commit();
		System.out.println("Employee Data Saved...");
	}
	
	public List<Employee> ShowAll()
	{
		Session session = sf.openSession();
		Query  qry = session.createQuery("from Employee");
		List<Employee>  empall = qry.list();
		return empall;
	}
	
	public Employee  SearchEmp(int empno)
	{
		Session session = sf.openSession();
		Employee empinfo = session.get(Employee.class, empno);
		return empinfo;
	}
}
