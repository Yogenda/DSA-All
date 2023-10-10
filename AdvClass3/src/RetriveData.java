import java.sql.*;

public class RetriveData {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/Phase2Db","root", "root");
			
			Statement stmt = conObj.createStatement();
			
			ResultSet  rs = stmt.executeQuery("Select * from Student");
			
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

}
