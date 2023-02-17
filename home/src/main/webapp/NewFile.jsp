<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function demo()
{
for(var i=0; i < document.form1.subject.length; i++)
{
if(!document.f.subject[i].checked)
{
alert("Please Select Your options");
return false;
}
else
{
alert("Click Submit to Know your choices");
return true;
}
}
}
</script>
<title>Sample</title>
</head>
<body>
<form name="f" onsubmit="demo()">
<h3>Please Select your Choices</h3>
<p><input type="checkbox" name="subject" value="server1"/>server1</p>
<p><input type="checkbox" name="subject" value="server2"/>server2</p>
<p><input type="checkbox" name="subject" value="server3"/>server3</p>
<p><input type="checkbox" name="subject" value="server4"/>server4</p>
<p><input type="checkbox" name="subject" value="server5"/>server5</p>
<p><input type="submit" value="submit" />
</form>
<%
String subject[]= request.getParameterValues("subject");
if(subject != null)
{
%>
<h4>You selected options </h4>
<ul>
<%
for(int i=0; i<subject.length; i++)
{
%>
<li><%=subject[i]%></li>
<%
}
%>
</ul>
<%
}
%>
</body>
</html>