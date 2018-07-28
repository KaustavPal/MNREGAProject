<%@page import="bean.DelGPMBean"%>
<%@page import="bean.AddGPMBean"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Gram Panchayet Member</title>
</head>
<body background=4.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<p align=center><font size=5>List Of Gram Panchayet Member</font></p>
 <%!String userid, name; 
	Collection<DelGPMBean> list;%>
	<%list=(Collection<DelGPMBean>)request.getAttribute("LIST"); %> 
	
	<table align="center" border=1 cellpadding=5>
	<tr><th>User ID</th><th>Name</th></tr>
	<%
	for(DelGPMBean p:list)
	{
		userid=p.getUserid();
		name=p.getName();%>
		<tr>
		<td><%=userid %></td>
		<td><%=name %></td>
		</tr>
	<%	
	}
	%>
	</table>
	<br>
	<p align=center><font size=3>Delete Gram Panchayet Member</font></p>
	<form align=center action="DelGPMServlet" method="post">
	<input type="text" name="userid" placeholder="Enter User ID">
	<input type="submit" value="Delete">
	</form>
                
</body>
</html>