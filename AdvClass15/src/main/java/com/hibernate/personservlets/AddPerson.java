package com.hibernate.personservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.PersonOperations;
import com.hibernate.model.Person;

/**
 * Servlet implementation class AddPerson
 */
@WebServlet("/AddPerson")
public class AddPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddPerson() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("txtPname");
		String phone = request.getParameter("txtPhone");
		String email = request.getParameter("txtEmail");
		String pwd = request.getParameter("txtPwd");
		
		Person person = new Person();
		person.setPersoname(pname);
		person.setEmail(email);
		person.setPhone(phone);
		person.setPwd(pwd);
		PersonOperations po = new PersonOperations();
		po.AddPerson(person);
		response.sendRedirect("AddPersons.jsp");
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
