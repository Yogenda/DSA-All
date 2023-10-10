package cls;
import java.sql.*;
import java.util.Scanner;
public class AddRowDynamicallyUsingPreparedStstement {

	public static void main(String[] args) {
		try
		{
			Scanner sc  = new Scanner(System.in);
			
			System.out.println("Roll Number ");
			int rno = sc.nextInt();
			System.out.println("Student Name ");
			String sname = sc.next();
			System.out.println("Course");
			String course = sc.next();
			System.out.println("Fees ");
			float fees = sc.nextFloat();
						
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstDB","root", "root");
			
			PreparedStatement ps = conObj.prepareStatement("Insert into Student(rollno, stdname, course, fees) values(?,?,?,?)");
			ps.setInt(1, rno);
			ps.setString(2, sname);
			ps.setString(3, course);
			ps.setFloat(4, fees);
			
			int res = ps.executeUpdate();
			
			if(res>=1)
				System.out.println("row inserted...");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
