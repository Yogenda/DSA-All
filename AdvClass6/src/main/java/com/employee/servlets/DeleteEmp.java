package com.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.operations.EmpOperations;

/**
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/DeleteEmp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("empid");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.print(eno);
		
		EmpOperations eo = new EmpOperations();
		
		String res = eo.DeleteEmp(Integer.parseInt(eno));
		
		if(res.equals("Success"))
			response.sendRedirect("GetAllEmp");
		
	}

}
