import java.sql.*;
public class AddRow {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/Phase2Db","root", "root");

			//INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(101, 'PRAVEEN KUMAR', 'JAVA', 15000.00);
			
			Statement stmt = conObj.createStatement();
			
			stmt.executeUpdate("INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(101, 'PRAVEEN KUMAR', 'JAVA', 15000.00)");
			
			System.out.println("row inserted...");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
