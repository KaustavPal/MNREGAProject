
<%@page import="bean.C_ProjectBean"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project List</title>
</head>
<body background=4.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<p align=center><font size=5>List Of Project</font></p>
	<%!String pid,pname,plocation,pduration,phead,pgpm;
	Collection<C_ProjectBean> list;%>
	
	<%list=(Collection<C_ProjectBean>)request.getAttribute("LIST"); %>
	
<table border=1 align="center">
	<tr>

	<th>Project ID</th><th>Project Name</th><th>Project Location</th><th>Project Duration</th><th>No. Of Head</th><th>Assigned Gram Panchayet Member</th>
	</tr>
	<%
	for(C_ProjectBean p:list)
	{
		pid=p.getPid();
		pname=p.getPname();
		plocation=p.getPlocation();
		pduration=p.getPduration();
		phead=p.getPhead();
		pgpm=p.getPgpm();
		
		%>
		<tr>
		<td><%=pid %></td>
		<td><%=pname %></td>
		<td><%=plocation %></td>
		<td><%=pduration %></td>
		<td><%=phead %></td>
		<td><%=pgpm %></td>
		
		</tr>
	<%	
	}
	%>
	</table>

</body>
</html>