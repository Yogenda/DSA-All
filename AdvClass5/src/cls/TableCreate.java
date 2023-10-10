package cls;
import java.sql.*;
public class TableCreate {

	public static void main(String[] args) throws Exception {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstDB","root", "root");
		
		//select schema_name from information_schema.schemata where schema_name = 'phase2db';
		
		PreparedStatement ps = conObj.prepareStatement("select schema_name from information_schema.schemata where schema_name = 'SimpliDb3'");
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
			System.out.println("Db Already Exist");
		else
		{
			PreparedStatement ps1 = conObj.prepareStatement("Create Database SimpliDb3");
			ps1.execute();
			
			System.out.println("Db Created...");
		}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}
}
