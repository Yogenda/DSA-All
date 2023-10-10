package com.student.dmloperations;
import com.student.connection.*;
import java.sql.*;
public class StudentOperations {

	private Connection con;
	private PreparedStatement ps;
	
	public StudentOperations()
	{
		con = DbConnection.GetConnection();
	}
	
	public String AddNewStudent(int rno, String sname, String course, float fees)
	{
		String chk ="Err";
		try
		{
			ps = con.prepareStatement("Insert into Student(rollno, stdname, course, fees) values(?,?,?,?)");
			ps.setInt(1, rno);
			ps.setString(2, sname);
			ps.setString(3, course);
			ps.setFloat(4, fees);
			
			int res = ps.executeUpdate();
			if(res>=1)
				chk="Success";
		}
		catch(Exception ex)
		{
			chk = ex.getMessage();
		}
		
		return chk;
	}
	
	public void ShowAllStudents()
	{
		try
		{
			ps = con.prepareStatement("Select * from Student");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("rollno"));
				System.out.println("Student Name : " + rs.getString("stdname"));
				System.out.println("Course : " + rs.getString("course"));
				System.out.println("Fees : " + rs.getFloat("fees"));
				System.out.println("--------------------");
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public void SearchStudent(int rno)
	{
		try
		{
			ps = con.prepareStatement("Select * from Student where rollno=?");
			ps.setInt(1, rno);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("rollno"));
				System.out.println("Student Name : " + rs.getString("stdname"));
				System.out.println("Course : " + rs.getString("course"));
				System.out.println("Fees : " + rs.getFloat("fees"));
				System.out.println("--------------------");
			}
			else
				System.out.println("Student Not Found...");
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public String DeleteStudent(int rno)
	{
		String chk ="Err";
		try
		{
			ps = con.prepareStatement("Delete from student where rollno=?");
			ps.setInt(1, rno);
			
			int res = ps.executeUpdate();
			if(res>=1)
				chk="Success";
		}
		catch(Exception ex)
		{
			chk = ex.getMessage();
		}
		
		return chk;
	}
	
	
	public String UpdateStudent(String sname, int rno)
	{
		String chk ="Err";
		try
		{
			ps = con.prepareStatement("Update student set stdname=? where rollno=?");
			ps.setString(1, sname);
			ps.setInt(2, rno);
			
			int res = ps.executeUpdate();
			if(res>=1)
				chk="Success";
		}
		catch(Exception ex)
		{
			chk = ex.getMessage();
		}
		
		return chk;
	}
	
	
	public void ShowAllStudentCourses()
	{
		/*\
		 * SELECT s.id,  s.stdname,  c.coursename FROM students as s INNER JOIN std_course AS sc  ON s.id = sc.sid INNER JOIN course as c  ON c.cid = sc.cid;
		 */
		try
		{
			ps = con.prepareStatement("SELECT s.id,  s.stdname,  c.coursename FROM students as s INNER JOIN std_course AS sc  ON s.id = sc.sid INNER JOIN course as c  ON c.cid = sc.cid");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("id"));
				System.out.println("Student Name : " + rs.getString("stdname"));
				System.out.println("Course : " + rs.getString("coursename"));
				System.out.println("--------------------");
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
