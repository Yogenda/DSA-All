package com.student.info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.connection.DbConnection;
import com.employee.model.Employee;
import com.employee.model.Student;

public class StudentInfo {

	private  Connection con;
	private  PreparedStatement ps;

	public StudentInfo()
	{
		con =  DbConnection.GetConnection();		
	}
	
	
	public String AddNewStudent(Student std)
	{
		String chk = "Err";
		try
		{
			ps = con.prepareStatement("insert into studentmaster(rollno, stdname, classid) value(?,?,?)");
			ps.setInt(1, std.getRollno());
			ps.setString(2, std.getSname());
			ps.setInt(3, std.getClassid());
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
	
	public ResultSet  ShowAllClasses()
	{
		ResultSet rs = null;
		try
		{
			ps = con.prepareStatement("Select * from Classes");
			rs = ps.executeQuery();
		}
		catch(Exception ex)
		{
			rs = null;
		}
		return rs;
	}
}
