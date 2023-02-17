<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name = request.getParameter("un");
String pw = request.getParameter("pw");
String cpw = request.getParameter("cpw");
if(pw==cpw){
	out.print("welcome::"+name);
}
else{
	out.print("password is incorrect");
}


%>
</body>
</html>