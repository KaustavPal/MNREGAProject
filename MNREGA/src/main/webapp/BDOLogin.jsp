<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BDO Log In Page</title>
</head>
<body background=2.jpg>
<div align="center">
    
    <h1><font color=green>BDO Log In</font></h1> 
  
  <form action="BDOLoginServlet" method="post">
      <table border="1">
        <tr>
           <td><b>USER ID :</b></td>
            <td><input type="text" name="userid" placeholder="Type ID" required="required"></td>
         </tr>
         
         <tr> 
           <td><b>PASSWORD :</b></td>
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
            <input type="submit" value="Log In" >
             <input type="reset" value= "Reset"> 
     	</div>
     </form>
   </div>
</body>
</html>