<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gram Panchayet member Login</title>
</head>
<body background=6.jpg>
<div align="center">
    
    <h1><font color=green> Gram Panchayet Member LogIn</font> </h1> 
  
  <form action="GPMLoginServlet" method="post">
      <table border="1">
        <tr>
           <td><b>USER ID :</b></td>
            <td><input type="text" name="userid" placeholder="Type id" required="required"></td>
         </tr>
         
        <tr> 
           <td>PASSWORD :</td>
           <td><input type="password" name="password"></td>
        </tr>
         </table>
         
         <%
String login_msg=(String)request.getAttribute("error");  
if(login_msg!=null)
out.println("<center><font color=red size=4px>"+login_msg+"</font></center>");
%>
			<br>
         <div align=center>
            <td> <input type="submit" value="Log In"> 
            <td> <input type="RESET" value= "Clear">
           </div>
     
    </form>
</div>

</body>
</html>