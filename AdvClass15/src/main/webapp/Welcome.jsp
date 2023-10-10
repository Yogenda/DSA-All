<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script> 
</head>
<body>
<h1>Welcome To : <%=session.getAttribute("pname") %></h1>
<h1>
<a href="ChangePwd.jsp">Change Password</a> &nbsp;&nbsp;|&nbsp;&nbsp;
<a href="Login.jsp">Logout</a></h1>
<hr />

<table width="50%" border="1">
<tr>
<td>Person Name : </td>
<td><%=session.getAttribute("pname") %></td>
</tr>
<tr>
<td>Phone : </td>
<td><%=session.getAttribute("ph") %></td>
</tr>
<tr>
<td>Person email : </td>
<td><%=session.getAttribute("pemail") %></td>
</tr>
</table>

</body>
</html>