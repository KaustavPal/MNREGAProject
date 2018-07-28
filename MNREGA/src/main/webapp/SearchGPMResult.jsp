<%@page import="java.io.PrintWriter"%>
<%@page import="bean.AddGPMBean"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result of Gram Panchayet Members</title>
</head>
<body background=4.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<%
String login_msg=(String)request.getAttribute("NAME");  
if(login_msg!=null)
%>
<p align=center><font size=5>Search Result Of Gram Panchayet Members for Keyword: '<%=login_msg %>'</font></p>
 <%!String userid,password,name,gender,dob,address,mobileno,emailid; 
	Collection<AddGPMBean> list;%>
	<%list=(Collection<AddGPMBean>)request.getAttribute("LIST"); 
	%> 
	
	<table align="center" border=1 cellpadding=5>
	<tr><th>User ID</th><th>Password</th><th>Name</th><th>Gender</th><th>Date Of Birth</th><th>Address</th><th>Mobile No.</th><th>Email ID</th></tr>
	<%
	
	
	for(AddGPMBean p:list)
	{
		userid=p.getUserid();
		password=p.getPassword();
		name=p.getName();
		gender=p.getGender();
		dob=p.getDob();
		address=p.getAddress();
		mobileno=p.getMobileno();
		emailid=p.getEmailid();%>
		<tr>
		<td><%=userid %></td>
		<td><%=password %></td>
		<td><%=name %></td>
		<td><%=gender %></td>
		<td><%=dob %></td>
		<td><%=address %></td>
		<td><%=mobileno %></td>
		<td><%=emailid %></td>
		</tr>
	<%	
	}
	
	
	%>
	</table>

	<p align=center><a href="SearchGPM.jsp">Try Another Name</a>&nbsp;&nbsp;&nbsp;<a href="BDOWork.jsp">Back To DashBoard</a></p>	
</body>
</html>