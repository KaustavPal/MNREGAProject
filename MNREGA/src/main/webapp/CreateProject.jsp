<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><font color=green>Create Project</font></title>
</head>
<body background=4.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<p align=center><b><u><font size=5>Create Project</font></u></b></p>
<form action="C_ProjectServlet" method="get">
<table align="center" cellpadding=15>
<tr><td>Project ID: </td><td><input type="text" name="pid" size=40 require="required"></td></tr>
<tr><td>Project Name: </td><td><input type="text" name="pname" require="required" size=40></td></tr>
<tr><td>Project Location: </td><td><input type="text" name="plocation" require="required" require="required" size=40></td></tr>
<tr><td>Project Duration(in Days): </td><td><input type="number" name="pduration" size=40></td></tr>
<tr><td>No. Of Head </td><td><input type="number" name="phead" require="required" size=10></td></tr>
<tr><td>Assign GPM: </td><td><input type="text" name="pgpm" placeholder="Enter User ID" require="required" size=40>&nbsp;&nbsp;&nbsp;<a href="ShowGPMServlet" target="blank">View GPM List</a></td></tr>
</table>
 <br>
<center><input type="submit" value="Create">&nbsp;&nbsp;
<input type="RESET" value= "Clear"></center> 
           
</form>
</body>
</html>