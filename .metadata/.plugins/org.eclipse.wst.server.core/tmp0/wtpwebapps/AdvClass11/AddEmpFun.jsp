<%@page import="com.employee.connection.*" %>
<%@page import="com.employee.model.*" %>
<%@page import="com.employee.operations.*" %>
<%
String ename = request.getParameter("txtEname");
String job = request.getParameter("txtJob");
String salary = request.getParameter("txtSal");
String email = request.getParameter("txtEmail");
String pwd = request.getParameter("txtPass");

Employee emp = new Employee();
emp.setEname(ename);
emp.setJob(job);
emp.setEmail(email);
emp.setPwd(pwd);
emp.setSal(Float.parseFloat(salary));

EmpOperations eo = new EmpOperations();

String str = eo.AddNewEmp(emp);

if(str.equals("Success"))
{
	session.setAttribute("info", "New Employee Added Successfully");
	response.sendRedirect("AddNewEmp.jsp");
}
else
{
	session.setAttribute("info", "New Employee Not Added Successfully");
	response.sendRedirect("AddNewEmp.jsp");
}

%>