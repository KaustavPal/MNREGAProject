<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Gram Panchayet Member</title>
</head>
<body background=4.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<p align=center><font size=5>Search Gram Panchayet Member</font></p>
	<form align=center action="SearchGPMServlet" method="get">
	<input type="text" name="name" placeholder="Enter Member's Name">
	<input type="submit" value="Search"></form>
</body>
</html>