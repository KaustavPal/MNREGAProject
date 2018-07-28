<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BDO DashBoard</title>
</head>
<body background=2.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<!-- <div align=right><a href="LogoutServlet">Log Out</a></div>-->
<div align="center">
    
    <h1> BDO DashBoard </h1> 
  
  <form action="BDOWorks" method="get">   
         <br>
         
            <td>
            <input type="submit" name="action" value="Add New Gram Panchayet member">
            <input type="submit" name="action" value="Delete Gram Panchayet member">
            <input type="submit" name="action" value="Search Gram Panchayet member"> 
            <input type="submit" name="action" value="Create New Project">
            <input type="submit" name="action" value="View List Of Project">
            
      
     
    </form>

</div>

</body>
</html>