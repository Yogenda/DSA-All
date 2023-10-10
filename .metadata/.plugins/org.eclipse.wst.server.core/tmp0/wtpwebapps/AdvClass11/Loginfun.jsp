<%@page import="com.employee.connection.*" %>
<%@page import="com.employee.model.*" %>
<%@page import="com.employee.operations.*" %>
<%

String uname = request.getParameter("txtUsername");
String pwd = request.getParameter("txtPass");

if(uname.equals("Admin") && pwd.equals("Admin"))
{
	response.sendRedirect("ShowAllEmps.jsp");
}
else
{
	EmpOperations eo = new EmpOperations();
	Employee emp = eo.LoginCheck(uname, pwd);

	if(emp!=null)
	{
		session.setAttribute("ename", emp.getEname());
		response.sendRedirect("ViewEmp.jsp");
	}
	else
	{
		session.setAttribute("info", "Please check username/password");
		response.sendRedirect("Login.jsp");
	}
		
}


%>