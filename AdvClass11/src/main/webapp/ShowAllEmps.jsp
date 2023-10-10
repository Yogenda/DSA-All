<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
   
<%@page import="com.employee.connection.*" %>
<%@page import="com.employee.model.*" %>
<%@page import="com.employee.operations.*" %>
<%@page import="java.util.*" %>
<%
		EmpOperations eo = new EmpOperations();
		List<Employee>  empinfo = eo.ShowAllEmp();
		System.out.println(empinfo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<jsp:include page="Links.jsp"/>
<table width="100%" border="1">
	<tr>
	<th>Employee No</th>
	<th>Employee Name</th>
	<th>Employee Job</th>
	<th>Employee Salary</th>
	<th>Employee Email</th>
	<th>Account Password</th>
	</tr>
	<%
	for(Employee emp : empinfo)
	{
			%>
			<tr>
			<td><%=emp.getEmpno() %></td>
			<td><%=emp.getEname() %></td>
			<td><%=emp.getJob() %></td>
			<td><%=emp.getSal() %></td>
			<td><%=emp.getEmail() %></td>
			<td><%=emp.getPwd() %></td>
			</tr>
		<%
		}
	%>
<!-- 
	<c:forEach items="${empinfo }" var="emp"  >
		<tr>
		<td><c:out value="${emp.empno }" />  </td>
		<td><c:out value="${emp.ename }" />  </td>
		<td><c:out value="${emp.job }" />  </td>
		<td><c:out value="${emp.sal }" />  </td>
		<td><c:out value="${emp.email }" />  </td>
		<td><c:out value="${emp.pwd }" />  </td>
		</tr>
	</c:forEach>
	 -->
</table>
</body>
</html>