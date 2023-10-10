package dem;

import java.sql.*;

public class TestConn {

	public static void main(String[] args) throws Exception{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/Phase2Db","root", "root");
		
		if(conObj!=null)
			System.out.println("Connected...");
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}
}
