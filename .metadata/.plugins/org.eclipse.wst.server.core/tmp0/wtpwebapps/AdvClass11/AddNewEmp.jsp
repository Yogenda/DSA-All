<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Links.jsp"/>
<form name="frmEmp"  method="POST"  action="AddEmpFun.jsp">
<table width="50%" border="1">
<tr>
<td>Employee Name : </td>
<td>
<input type="text"  name="txtEname"  />
</td>
</tr>

<tr>
<td>Employee Job : </td>
<td>
<input type="text"  name="txtJob"  />
</td>
</tr>

<tr>
<td>Employee Salary : </td>
<td>
<input type="text"  name="txtSal"  />
</td>
</tr>

<tr>
<td>Employee Email : </td>
<td>
<input type="email"  name="txtEmail"  />
</td>
</tr>

<tr>
<td>Employee Password : </td>
<td>
<input type="text"  name="txtPass"  />
</td>
</tr>

<tr>
<td>
<input type="submit"  value="Add Employee" />
</td>
<td>
<input type="reset"  value="Clear Form" />
</td>
</tr>


</table>

</form>
</body>
</html>