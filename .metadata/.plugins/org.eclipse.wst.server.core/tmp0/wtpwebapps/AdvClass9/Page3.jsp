<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<cr:out value="${'this is jsp jstl'}"></cr:out>
	</h1>
	<cr:set var="sname" scope="session" value="${'Suresh'}"/>
	<h1><cr:out value="${sname}"/></h1>
	<p>value after removing</p>
	<cr:remove var="sname"/>
	<h1><cr:out value="${sname}"/></h1>
	
	<cr:set var="age" scope="session" value="${12 }"/>
	Person age:<cr:out value="${age }"/>
	<cr:if test="${age>=20 }">
		<h2>Person age is greater than 20</h2>
	</cr:if>
	<cr:if test="${age<20 }">
		<h2>Person age is less than 20</h2>
	</cr:if>
	
	<cr:forEach var="x" begin="1" end="10">
		<p>value is: <cr:out value="${x }"/></p>
	</cr:forEach>
	<cr:redirect url="Page2.jsp"/>
</body>
</html>