package com.hibernate.personservlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.PersonOperations;
import com.hibernate.model.Person;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname =request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		
		//Path path = Paths.get("src/adminuser.txt"); 
		//String fname = path.toAbsolutePath().toString();
		//System.out.println(fname);
		String fname = "C:\\Phase2Weekend\\PersonsApp\\src\\adminuser.txt";
		
		FileReader fr = new FileReader(fname);
		BufferedReader br = new BufferedReader(fr);
		String userinfo = br.readLine();
		//System.out.println(userinfo);
		String[] uinfo = userinfo.split(" ");
		//System.out.println(uinfo[0] + "  " + uinfo[1]);
		if(uname.equals(uinfo[0]) && pwd.equals(uinfo[1]))
		{
			response.sendRedirect("AdminWelcome.jsp");
		}
		else
		{
			PersonOperations po = new PersonOperations();
			Person person = po.CheckLoginDetails(uname, pwd);
			
			if(person!=null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("pid", person.getPersonid());
				session.setAttribute("pname", person.getPersoname());
				session.setAttribute("ph", person.getPhone());
				session.setAttribute("pemail", person.getEmail());
				session.setAttribute("ppwd", person.getPwd());
				
				response.sendRedirect("Welcome.jsp");
			}
			else
				response.sendRedirect("Error.jsp");
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
