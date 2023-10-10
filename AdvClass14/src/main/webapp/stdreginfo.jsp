<%@page import="com.employee.connection.*" %>
<%@page import="com.employee.model.*" %>
<%@page import="com.student.info.*" %>
<%
String rno = request.getParameter("txtRno");
String sname = request.getParameter("txtSname");
String cid = request.getParameter("ddlclass");

System.out.println(rno + "  " +  sname + "  "+ cid);

Student std = new Student();
std.setRollno(Integer.parseInt(rno));
std.setSname(sname);
std.setClassid(Integer.parseInt(cid));
StudentInfo sinfo = new StudentInfo();
String res = sinfo.AddNewStudent(std);
if(res.equals("Success"))
	response.sendRedirect("StdReg.jsp");
%>