<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gram Panchayet Member Registration Page</title>
</head>
<body background=4.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
  <div align="center">
<a href="BDOWork.jsp">Back To DashBoard</a>   
    <h1>Gram Panchayet member Registration Form</h1> 
  
  <form action="AddGPM" method="get">
      <table cellpadding=15>
        <tr>
           <td>USER ID :</td>
            <td><input type="text" name="userid" placeholder="Enter ID" required="required"></td>
         </tr>
         
        <tr> 
           <td>PASSWORD :</td>
           <td><input type="password" name="password" required="required"></td>
        </tr>

	<tr> 
           <td>NAME :</td>
           <td><input type="text" name="name" required="required"></td>
        </tr>
        
         <tr>
           <td>GENDER :</td>     
           <td> <input type="radio" name="gender" value="MALE" /> MALE  &nbsp;&nbsp;&nbsp;  
                <input type="radio" name="gender" value="FEMALE" />  FEMALE
            </td>
         </tr> 

	<tr> 
           <td>Date of birth :</td>
           <td><input type="date" name="dob"></td>
        </tr>      
          
           
          <tr>
             <td>ADDRESS </td>
             <td><textarea name="address" rows="4" cols="20"></textarea></td>
           </tr>

         <tr> 
           <td>Mobile Number :</td>
           <td><input type="number" name="mobileno" required="required"></td>
        </tr>
        <tr> 
           <td>Email ID :</td>
           <td><input type="text" name="emailid" required="required"></td>
        </tr>
           
     <%
String login_msg=(String)request.getAttribute("errorMessage");  
if(login_msg!=null)
out.println("<center><font color=red size=4px>"+login_msg+"</font></center>");
%>                
     </table> <br>      
         <div align=center>
            <input type="submit" value="REGISTER" >
             <input type="reset" value= "RESET"> 
     	</div>
    </form>
</div>
</body>
</html>