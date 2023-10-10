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
<form  action="LoginCheck"  method="POST">
<table width="50%">
<tr>
<td>Username/Email : </td>
<td><input type="text"  name="txtUser" /></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password"  name="txtPass" /></td>
</tr>

<tr>
<td><input type="submit"  value="Login Here" /></td>
<td><input type="reset"  value="Clear All" /></td>
</tr>

<tr>
<td colspan="2">
if new Person: <a href="AddPersons.jsp">Register Here</a>
</td>
</tr>
</table>
</form>
</body>
</html>