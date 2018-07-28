<%@page import="bean.AttendenceBean"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Attendence Result</title>
</head>
<body background=3.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<%
String login_msg=(String)request.getAttribute("NAME");  
if(login_msg!=null)
%>
<p align=center><font size=5>Attendence Result for User ID '<%=login_msg %>'</font></p>
 <%!String userid,attendence; 
	Collection<AttendenceBean> list;%>
	<%list=(Collection<AttendenceBean>)request.getAttribute("LIST"); 
	%> 
	
	<table align="center" border=1 cellpadding=5>
	<tr><th>User ID</th><th>Attendence</th></tr>
	<%
	
	
	for(AttendenceBean p:list)
	{
		userid=p.getUserid();
		attendence=p.getDate();%>
		<tr>
		<td><%=userid %></td>
		<td><%=attendence %>&nbsp day(s)</td>

		</tr>
	<%	
	}
	
	
	%>
	</table>

</body>
</html>