<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="<%=request.getContextPath() %>/studentsecond" method="get">
<center>
<table aligin = "center">
<td><tr><input type="text" name="id" placeholder="enter id"></td></tr><br>
<td><tr><input type="text" name="name" placeholder="enter name"></tr></td><br>
<td><tr><input type="text" name="sub1" placeholder="sub1"></tr></td><br>
<td><tr><input type="text" name="sub2" placeholder="sub2"></tr></td><br>
<td><tr><input type="text" name="sub3" placeholder="sub3"></tr></td><br>
<td><tr><input type="submit" name="submit">

</table>
</center>
</form>
</body>
</html>