<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frmLogin"  method="POST" action="loginProcess">
<table width="50%" border="1">
<tr>
<td>Username</td>
<td>
<input type="text"  name="txtUsername"  required />
</td>
</tr>

<tr>
<td>Password</td>
<td>
<input type="password"  name="txtPwd" required />
</td>
</tr>

<tr>
<td>
<input type="submit"  value="Click Me"  />
</td>
<td>
<input type="reset"  name="Clear All" />
</td>
</tr>
<tr>
<td colspan="2" style="text-align:center;color:red">
${msg}
</td>
</tr>
</table>
</form>
</body>
</html>