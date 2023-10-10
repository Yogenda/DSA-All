<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.employee.connection.*" %>
<%@page import="com.employee.model.*" %>
<%@page import="com.student.info.*" %>
<%@page import="java.sql.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="regs"  action="stdreginfo.jsp" method="POST">
Roll Number : <input type="text"  name="txtRno" />
<br />
Student Name : <input type="text" name="txtSname" />
<br />
Class to Join : 
<select name="ddlclass">
<option>select class</option>

<%
StudentInfo sinfo = new StudentInfo();
ResultSet rs = sinfo.ShowAllClasses();

while(rs.next())
{
%>
<option value='<%=rs.getInt("classid") %>'><%=rs.getString("classname") %></option>
<%
}
%>
</select>

<br />
<input type="submit" value="Register Student" />
</form>
</body>
</html>