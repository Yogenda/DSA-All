import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Scanner;
/**
 * Servlet implementation class AddStd
 */
@WebServlet("/AddStd")
public class AddStd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rno = request.getParameter("txtRno");
		String sname = request.getParameter("txtSname");
		String course = request.getParameter("txtCourse");
		String fees = request.getParameter("txtFees");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try
		{
			String inscmd = "INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(" + rno + ",'" + sname + "','" + course + "'," + fees + ")";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstDB","root", "root");
			
			Statement stmt = conObj.createStatement();
			
			int res = stmt.executeUpdate(inscmd);
			if(res>=1)
				response.sendRedirect("AddStudent.html");
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
