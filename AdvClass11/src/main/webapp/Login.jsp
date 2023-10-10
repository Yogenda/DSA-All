<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frmLogin"  method="POST"  action="Loginfun.jsp">
<table width="50%" border="1">
	<tr>
<td>Email/Username : </td>
<td>
<input type="text"  name="txtUsername"  />
</td>
</tr>

<tr>
<td>Password : </td>
<td>
<input type="password"  name="txtPass"  />
</td>
</tr>

<tr>
<td>
<input type="submit"  value="Login Here" />
</td>
<td>
<input type="reset"  value="Clear Form" />
</td>
</tr>

<tr>
<td colspan="2"  style="color:red">
<%
	if(session.getAttribute("info")!=null)
	{
		String str = (String)session.getAttribute("info");
%>
		<p><%=str %> </p>
		
<%
	}
%>
</td>
</tr>

</table>
</form>
</body>
</html>