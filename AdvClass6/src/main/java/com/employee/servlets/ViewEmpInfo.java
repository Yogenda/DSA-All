package com.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.model.Employee;

/**
 * Servlet implementation class ViewEmpInfo
 */
@WebServlet("/ViewEmpInfo")
public class ViewEmpInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmpInfo() {
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
		out.print("<a href='ChangePassword.html'>Change Password</a>");
		out.print("&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;");
		out.print("<a href='Login.html'>Logout</a>");
		out.print("</td></tr></table><hr />");
		
		HttpSession session = request.getSession();
		Employee emp = (Employee)session.getAttribute("empinfo"); 
		
		out.print("<table width='100%' border='1'><tr>");
		out.print("<th>Employee Number</th><th>Employee Name</th><th>Job</th><th>Salary</th><th>Email</th></tr>");
		out.print("<tr>");
		out.print("<td>" + emp.getEmpno() + "</td>");
		out.print("<td>" + emp.getEname() + "</td>");
		out.print("<td>" + emp.getJob() + "</td>");
		out.print("<td>" + emp.getSal() + "</td>");
		out.print("<td>" + emp.getEmail() + "</td>");
		out.print("</tr></table>");
	}

}
