<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="AddPerson"  method="POST">
<table width="50%">
<tr>
<td>Person Name : </td>
<td><input type="text"  name="txtPname" /></td>
</tr>
<tr>
<td>Phone : </td>
<td><input type="text"  name="txtPhone" /></td>
</tr>
<tr>
<td>Person email : </td>
<td><input type="email"  name="txtEmail" /></td>
</tr>
<tr>
<td>Password :  </td>
<td><input type="text"  name="txtPwd" /></td>
</tr>

<tr>
<td><input type="submit"  value="Add Person" /></td>
<td><input type="reset"  value="Clear All" /></td>
</tr>

<tr>
<td colspan="2">
if already Registered: <a href="Login.jsp">Login Here</a>
</td>
</tr>
</table>
</form>
</body>
</html>