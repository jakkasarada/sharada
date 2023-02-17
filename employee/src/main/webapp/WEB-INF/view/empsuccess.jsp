<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" >
var id, name, desc, phno, adhar;
id = document.myform.empid.value;

</script>
</head>
<body>
<form>
<h1>your registration is successfull </h1>
<%
String id = request.getParameter("empid");
String name = request.getParameter("empname");
String desc = request.getParameter("empdesc");
String phno = request.getParameter("empphno");
String adhar = request.getParameter("empadhar");
out.print("employee id::"+id+"<br>");
out.print("employee name::"+name+"<br>");
out.print("employee designation::"+desc+"<br>");
out.print("employee phone number::"+phno+"<br>");
out.print("employee adhar::"+adhar+"<br>");


%>
</form>
</body>
</html>