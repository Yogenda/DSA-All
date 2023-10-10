<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*, java.util.Scanner" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Page1.jsp"/>
	<h1>Hello world</h1>
	<%
		int x=10;
		float y=15.7f;
	%>
	<h1>Value of X is: <%=x %></h1>
	<h1>Value of Y is: <%=y %></h1>
	<jsp:include page="Page1.jsp"/>
</body>
</html>