package com.employee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.model.Employee;
import com.employee.operations.EmpOperations;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("txtUsername");
		String pwd = request.getParameter("txtPass");
		
		if(user.equals("Admin")  && pwd.equals("Admin"))
			response.sendRedirect("GetAllEmp");
		else
		{
			EmpOperations  eo = new EmpOperations();
			Employee emp = eo.LoginCheck(user, pwd);
			if(emp!=null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("empinfo", emp);
				response.sendRedirect("ViewEmpInfo");
			}
			else
				response.sendRedirect("Error.html");
		}
	}
}
