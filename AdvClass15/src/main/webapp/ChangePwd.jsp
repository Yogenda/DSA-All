<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To : <%=session.getAttribute("pname") %></h1>
<h1>
<a href="ChangePwd.jsp">Change Password</a> &nbsp;&nbsp;|&nbsp;&nbsp;
<a href="Login.jsp">Logout</a></h1>
<hr />
<form  action="ChangePwd"  method="POST">
<table width="50%">
<tr>
<td>Current Password : </td>
<td><%=session.getAttribute("ppwd") %></td>
</tr>
<tr>
<td>New Password : </td>
<td><input type="text"  name="txtNpwd" /></td>
</tr>

<tr>
<td><input type="submit"  value="Change Password" /></td>
<td><input type="reset"  value="Clear All" /></td>
</tr>
</table>
</form>
</body>
</html>