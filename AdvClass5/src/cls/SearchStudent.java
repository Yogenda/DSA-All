package cls;

import java.sql.*;
import java.util.Scanner;
public class SearchStudent {
// search student based on rollno
	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Roll Number : ");
			int rno = sc.nextInt();
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstDB","root", "root");
		
		PreparedStatement ps = conObj.prepareStatement("select * from student where rollno=?");
		ps.setInt(1, rno);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("Roll Number : " + rs.getInt("rollno"));
			System.out.println("Student Name : " + rs.getString("stdname"));
			System.out.println("Course : " + rs.getString("course"));
			System.out.println("Fees : " + rs.getFloat("fees"));
		}
		else
			System.out.println("Student Not Found....");
		
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}

}
