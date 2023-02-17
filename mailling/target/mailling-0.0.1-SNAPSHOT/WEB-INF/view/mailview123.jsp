<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/psservlet" method="get">
<table aligin="center">
<td><tr><input type="text" name="un" placeholder="user name"></tr></td><br>
<td><tr><input type="password" name="pw" placeholder="pass word"></tr></td><br>
<td><tr><input type="text" name="cpw" placeholder="conform password"></tr></td><br>
<td><tr><input type="submit" name="submit">
</table>
</form>
</body>
</html>