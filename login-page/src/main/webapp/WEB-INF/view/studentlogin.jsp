<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
	background-image:
		url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>

<script type="text/javascript">
function add(var i,var j){
var a=i+j;
}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crunchify JSP Servlet Example</title>
</head>
<body>

<script type="text/javascript">
<input type="button" value="submit" onclick="add(2,2)"/>
</script>
	<form action="<%=request.getContextPath()%>/studentSecondServlet" method="GET">
		<h1>REGISTRATION FORM</h1>
		<label for="user">student ID</label>
		 <input type="number"
			placeholder="student id" name="id"><br>
			 <label for="Name">student
			Name</label>
			 <input type="text" placeholder="student Name" name="name"
			name="empid"><br> <label for="phno">student phno</label> 
			<input
			type="number" placeholder="student phno" name="phno"><br>
			
			 <input
			type="submit" value="submit" />
	</form>
</body>
</html>