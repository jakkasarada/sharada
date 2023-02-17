<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/second" method="GET">
<h1> Login Form</h1>
<label>ID</label>
<input type="text" placeholder="id" name="id"><br>
<label>user-name</label>
<input type="text" placeholder="user-name" name="user-name"><br>
<label>pass-word</label>
<input type="text" placeholder="pass-word" name="pass-word"><br>
<input type="submit" value="submit">
</form>
</body>
</html>