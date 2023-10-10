import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class RetriveData
 */
@WebServlet("/RetriveData")
public class RetriveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstDB","root", "root");
			
			Statement stmt = conObj.createStatement();
			
			ResultSet  rs = stmt.executeQuery("Select * from Student");
			
			out.print("<table width='100%' border='1'>");
			out.print("<tr><th>Roll No</th><th>Student Name</th><th>Course</th><th>Fees</th></tr>");
			
			
			
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>" + rs.getInt("rollno") + "</td>");
				out.print("<td>" + rs.getString("stdname") + "</td>");
				out.print("<td>" + rs.getString("course") + "</td>");
				out.print("<td>" + rs.getFloat("fees") + "</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
