<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<script type="text/javascript"  src="myfirstjsfile.js">
/*Declare a text variable and print it to the HTML page*/
var mytext= "Example Text.";
/*Call the function*/
alert(mytext);

</script>
<center>
<form action="<%=request.getContextPath()%>/teoservlet" method="get">
<h1> enter details</h1>
<input type="text" value="name" placeholder="enter name">
<input type="text" value="age" placeholder="enter age">
<input type="text" value="class" placeholder="enter class">
<input type="submit" value="submit"> 
</form>
</center>
</body>
</html>