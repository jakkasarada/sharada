<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/two" method="get">
<table>
<tr><td><input type="text" name="id" placeholder="enter your id">
<tr><td><input type="text" name="name" placeholder="enter your name">
<tr><td><input type="submit" name="submit">
</table>
</form>
</body>
</html>