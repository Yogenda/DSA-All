package com.employee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Employee;
import com.employee.operations.EmpOperations;

/**
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename = request.getParameter("txtEname");
		String job = request.getParameter("txtJob");
		String sal = request.getParameter("txtSal");
		String email = request.getParameter("txtEmail");
		String pwd = request.getParameter("txtPass");
		try
		{
			Employee emp = new Employee();
			emp.setEname(ename);
			emp.setJob(job);
			emp.setSal(Float.parseFloat(sal));
			emp.setEmail(email);
			emp.setPwd(pwd);
			
			EmpOperations  eoperations = new EmpOperations();
			String res = eoperations.AddNewEmp(emp);
			
			if(res.equals("Success"))
				response.sendRedirect("GetAllEmp");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
