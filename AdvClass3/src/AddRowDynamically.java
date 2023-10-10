import java.sql.*;
import java.util.Scanner;
public class AddRowDynamically {

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
			
			String inscmd = "INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(" + rno + ",'" + sname + "','" + course + "'," + fees + ")";
			System.out.println(inscmd);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/Phase2Db","root", "root");
			
			Statement stmt = conObj.createStatement();
			
			stmt.executeUpdate(inscmd);
			
			System.out.println("row inserted...");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
