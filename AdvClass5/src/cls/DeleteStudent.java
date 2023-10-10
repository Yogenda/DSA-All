package cls;

import java.sql.*;
import java.util.Scanner;
public class DeleteStudent {
// Delete student based on rollno
	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = null;
		try
		{
			System.out.println("Enter Roll Number : ");
			int rno = sc.nextInt();
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstDB","root", "root");
		
		ps = conObj.prepareStatement("select * from student where rollno=?");
		ps.setInt(1, rno);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			ps = conObj.prepareStatement("Delete from student where rollno=?");
			ps.setInt(1, rno);
			int res = ps.executeUpdate();
			if(res>=1)
				System.out.println("Student Deleted");
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
