<%@page import="bean.C_ProjectBean"%>
<%@page import="bean.ERegBean"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="bean.AddGPMBean"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result of Project</title>
</head>
<body background=3.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<%
String srch_msg=(String)request.getAttribute("NAME");  
if(srch_msg!=null)
%>
<p align=center><font size=5>Search Result Of Project for Keyword: '<%=srch_msg %>'</font></p>
 <%!String userid,name,gender,dob,address,mobileno,pid;
 
	Collection<ERegBean> list;
%>
	<%list=(Collection<ERegBean>)request.getAttribute("LIST"); 

	%> 
	
	<table align="center" border=1 cellpadding=5>
	<tr><th>Project ID</th><th>Working Employee ID</th><th>Employee Name</th><th>Gender</th><th>Date Of Birth</th><th>Address</th><th>Mobile No.</th></tr>

	<%
	for(ERegBean p:list)
	{
		pid=p.getPid();
		userid=p.getUserid();
		name=p.getName();
		gender=p.getGender();
		dob=p.getDob();
		address=p.getAddress();
		mobileno=p.getMobileno();
		%>
		<tr>
		<td><%=pid %></td>
		<td><%=userid %></td>
		<td><%=name %></td>
		<td><%=gender %></td>
		<td><%=dob %></td>
		<td><%=address %></td>
		<td><%=mobileno %></td>
		
		</tr>
	<%	
	}
	
	
	%>
	</table>

		
</body>
</html>