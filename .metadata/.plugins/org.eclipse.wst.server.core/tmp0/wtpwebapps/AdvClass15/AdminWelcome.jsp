<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.hibernate.model.*" %>
<%@page import="com.hibernate.dao.*" %>
<%@page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Administrator</h1>
<h1><a href="Login.jsp">Logout</a></h1>
<hr />
<table width="100%" border="1">
<tr>
<th>Person Name </th>
<th>Phone Number </th>
<th>Email </th>
</tr>
<%
PersonOperations  po = new PersonOperations();
List<Person>  pall = po.ShowAll();
for(Person p : pall)
{
%>

<tr>
<td>
	<%=p.getPersoname() %>
</td>

<td>
<%=p.getPhone() %>
</td>

<td>
<%=p.getEmail() %>
</td>
</tr>
<%
}
%>
</table>
</body>
</html>