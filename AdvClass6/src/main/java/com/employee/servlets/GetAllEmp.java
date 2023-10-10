package com.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import com.employee.operations.EmpOperations;

/**
 * Servlet implementation class GetAllEmp
 */
@WebServlet("/GetAllEmp")
public class GetAllEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<table width='100%' style='text-align:center'>");
		out.print("<tr><td>");
		out.print("<a href='AddNewEmployee.html'>New Employee</a>");
		out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
		out.print("<a href='GetAllEmp'>View All Employees</a>");
		out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
		out.print("<a href='Login.html'>Logout</a>");
		out.print("</td></tr></table><hr />");
		
		try
		{
			EmpOperations empinfo = new EmpOperations();
			ResultSet rs = empinfo.ShowAllEmp();
			
			out.print("<table width='100%' border='1'><tr>");
			out.print("<th>Employee Number</th><th>Employee Name</th><th>Job</th><th>Salary</th><th>Email</th><th>Operations</th></tr>");
			
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>" + rs.getInt("empno") + "</td>");
				out.print("<td>" + rs.getString("ename") + "</td>");
				out.print("<td>" + rs.getString("job") + "</td>");
				out.print("<td>" + rs.getFloat("sal") + "</td>");
				out.print("<td>" + rs.getString("email") + "</td>");
				out.print("<td><a href='DeleteEmp?empid=" + rs.getInt("empno") + "'>Delete</a></td>");
				out.print("</tr>");
			}
			out.print("</table>");
		}
		catch(Exception ex)
		{
			
		}
	}

}
