<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<form name="sharada" action="<%=request.getContextPath()%>/empregsecondservlet" method="get">
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
<tr>
	<td> employee adhar <input type="text" placeholder="adhar" name="empadhar">
<tr>
	<td><input type="submit" value="submit" name="submit" onclick="employee()">
</table>
<<!-- script type="text/javascript">
function employee(){
	var id, name, phno, desc, adhar;
	id = document.sharada.empid.value;
	id = parseInt(id);
	name = document.sharada.empname.value;
	desc = document.sharada.empdesc.value;
	phno = document.sharada.empdesc.value;
	adhar = document.sharada.empadhar.value;
	document.writeln("employee id::"+id+"</br>");
	document.writeln("employee name::"+name+"</br>");
	document.writeln("employee designamtion::"+desc+"</br>");
	document.writeln("employee phno::"+phno+"</br>");
	document.writeln("employee adhar::"+adhar);
	
}
</script> -->
</form>

</body>
</html>