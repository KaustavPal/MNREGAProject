<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Attendence</title>
</head>
<body background=3.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
<p align=center><font size=5>Employee Attendence</font></p>
 <form action="AttendenceServlet" method="get">
      <table border="1" align=Center>
        <tr>
           <td><b>USER ID :</b></td>
            <td><input type="text" name="userid" placeholder="Type ID" required="required"></td>
         </tr>
         
         <tr> 
           <td><b>Date :</b></td>
           <td><input type="date" name="date"></td>
        </tr> 
     </table>
     <br>      
         <div align=center>
            <input type="submit" value="Submit" >
             <input type="reset" value= "Reset"> 
     	</div>
     	</form>
</body>
</html>