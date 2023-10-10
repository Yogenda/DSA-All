package com.employee.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection GetConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Phase2Db","root", "root");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return con;
	}
}
