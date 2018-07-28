<%@page import="bean.DelEmployeeBean"%>
<%@page import="bean.DelGPMBean"%>
<%@page import="bean.AddGPMBean"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
</head>
<body background=3.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<p align=center><font size=5>List Of Employee</font></p>
 <%!String userid, name; 
	Collection<DelEmployeeBean> list;%>
	<%list=(Collection<DelEmployeeBean>)request.getAttribute("LIST"); %> 
	
	<table align="center" border=1 cellpadding=5>
	<tr><th>User ID</th><th>Name</th></tr>
	<%
	for(DelEmployeeBean p:list)
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
	<p align=center><font size=3>Delete Employee</font></p>
	<form align=center action="DelEmployeeServlet" method="post">
	<input type="text" name="userid" placeholder="Enter User ID">
	<input type="submit" value="Delete">
	</form>
                
</body>
</html>