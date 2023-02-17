<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/mailsecondservlet" method="get">
      <%-- action="<%=request.getContextPath()%>/empregsecondservlet" --%>
<table align="center">
<lable> name :</lable>
<td><tr><input type="text" name="name" placeholder="enter your name"></tr></td><br>
<lable> father name::</lable>
<td><tr><input type="text" name="fname" placeholder="enter father name"></tr></td><br>
<lable> DOB: </lable>
<td><tr><input type="text" name="dob" placeholder="enter date of birth"></tr></td><br>
<lable>phone number:</lable>
<td><tr><input type="text" name="phno" placeholder="enter phone number"></tr></td><br>
<lable>mail:</lable>
<td><tr><input type="text" name="mail" placeholder="enter e-mail"></tr></td><br>
<input type="submit" name="submit" value="submit">
</table>
</form>
</body>
</html>