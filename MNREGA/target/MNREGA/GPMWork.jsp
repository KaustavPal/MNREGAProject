<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gram Panchayet Member DashBoard</title>
</head>
<body background=6.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<div align="center">
    
    <h1> Gram Panchayet Member DashBoard </h1> 
<%String nm=(String)request.getAttribute("NAME");%>
  
  <form action="GPMWorks" method="get">   
         <br>
         <tr>
            <td>
            <input type="submit" name="action" value="View Assigned Project">
            <input type="submit" name="action" value="Create New Employee">
            <input type="submit" name="action" value="Delete Employee">
            <input type="submit" name="action" value="Search Employee">
            <input type="submit" name="action" value="Search Project">
            <input type="submit" name="action" value="Employee attendence">
      </td>
     </tr>
    </form>
</div>
<%session.setAttribute("NM",nm);
%>
</body>
</html>