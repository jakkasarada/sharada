<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/studentthird" method="get">
<h1>your details are::</h1>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
int sub1 = Integer.parseInt(request.getParameter("sub1"));
int sub2 = Integer.parseInt(request.getParameter("sub2"));
int sub3 = Integer.parseInt(request.getParameter("sub3"));
/* out.println("student id::"+id+"<br>");
out.println("student name::"+name+"<br>");
out.println("subject1::"+sub1+"<br>");
out.println("subject2::"+sub2+"<br>");
out.println("subject3::"+sub3+"<br>");
 */
/* int tot = sub1+sub2+sub3;
int avg = tot/3;
if(avg<35){
	out.println("student id::"+id+"<br>");
	out.println("student name::"+name+"<br>");
	out.println("subject1::"+sub1+"<br>");
	out.println("subject2::"+sub2+"<br>");
	out.println("subject3::"+sub3+"<br>");
	out.println("total::"+tot+"FAIL");
}
else{
	if(avg>=75&&avg<=100){
		out.println("student id::"+id+"<br>");
		out.println("student name::"+name+"<br>");
		out.println("subject1::"+sub1+"<br>");
		out.println("subject2::"+sub2+"<br>");
		out.println("subject3::"+sub3+"<br>");
		out.println("total::"+tot+"<br>"+"distinction");
	}
	else if(avg>=50&&avg<75){
		out.println("student id::"+id+"<br>");
		out.println("student name::"+name+"<br>");
		out.println("subject1::"+sub1+"<br>");
		out.println("subject2::"+sub2+"<br>");
		out.println("subject3::"+sub3+"<br>");
		out.println("total::"+tot+"<br>"+"first class");
	}
	else{
		out.println("second class");
	}
}*/


%>
<input type="button" value="submit">
<%-- %!   
int sum(int n, int m, int k){  
return n+m+k;  
}  
%>  
<%=  %>  
		
		<%= "total is  :"+sum(Integer.parseInt(request.getParameter("sub1")),Integer.parseInt
				(request.getParameter("sub2")),Integer.parseInt(request.getParameter("sub3")))) %> --%>
</form>
</body>
</html>