package com.employee.operations;
import java.sql.*;

import com.employee.connection.DbConnection;
import com.employee.model.Employee;
public class EmpOperations {

	private  Connection con;
	private  PreparedStatement ps;
	
	public EmpOperations()
	{
		con =  DbConnection.GetConnection();
	}
	
	public String AddNewEmp(Employee emp)
	{
		String chk = "Err";
		try
		{
			ps = con.prepareStatement("insert into employee(ename, job, sal, email, pwd) value(?,?,?,?,?)");
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getJob());
			ps.setFloat(3, emp.getSal());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPwd());
			int res = ps.executeUpdate();
			
			if(res>=1)
				chk = "Success";
			
		}
		catch(Exception ex)
		{
			chk = ex.getMessage();
		}
		return chk;
	}
	
	public ResultSet  ShowAllEmp()
	{
		ResultSet rs = null;
		try
		{
			ps = con.prepareStatement("Select * from Employee  order by empno desc");
			rs = ps.executeQuery();
		}
		catch(Exception ex)
		{
			rs = null;
		}
		return rs;
	}
	
	public Employee SearchEmployee(int empno)
	{
		Employee emp=null;
		try
		{
			ps = con.prepareStatement("Select * from Employee where empno=?");
			ps.setInt(1, empno);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setSal(rs.getFloat("sal"));
				emp.setEmail(rs.getString("email"));
				emp.setPwd(rs.getString("pwd"));
			}
		}
		catch(Exception ex)
		{
			emp = null;
		}
		
		return emp;
	}
	
	public Employee LoginCheck(String email, String pwd)
	{
		Employee emp=null;
		//select * from employee where email='sahasra@gmail.com' and pwd='1234';
		try
		{
			ps = con.prepareStatement("Select * from Employee where email=? and pwd=?");
			ps.setString(1, email);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				emp = new Employee();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setSal(rs.getFloat("sal"));
				emp.setEmail(rs.getString("email"));
				emp.setPwd(rs.getString("pwd"));
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return emp;
	}	
	
	public String DeleteEmp(int eno)
	{
		String chk = "Err";
		try
		{
			ps = con.prepareStatement("Delete from Employee where empno=?");
			ps.setInt(1, eno);
			int res = ps.executeUpdate();
			
			if(res>=1)
				chk = "Success";
			
		}
		catch(Exception ex)
		{
			chk = ex.getMessage();
		}
		return chk;
	}
}
