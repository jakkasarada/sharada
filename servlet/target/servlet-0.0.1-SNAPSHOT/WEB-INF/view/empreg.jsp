<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/empregsecondservlet " method="get">
<table align="center" border="2">
<tr>
	<td> employee number <input type="text" placeholder="enter employee number" name="empid">
<tr>
	<td> employee name  <input type="text" placeholder="enter employee name" name="empname">
<tr>
	<td> employee designation <input type="text" placeholder="enter employee designation" name="empdesc">
<tr>
	<td> employee phone number <input type="text" placeholder="phone number" name="empphno">
<tr>
	<td><input type ="submit" name="submit">
</table>

</form>

</body>
</html>