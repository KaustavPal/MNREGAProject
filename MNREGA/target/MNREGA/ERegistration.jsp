<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Page</title>
</head>
<body background=3.jpg>
<div align=right>
<form action="${pageContext.request.contextPath}/LogoutServlet" method="post">
    <input type="submit" value="Logout" />
</form>
</div>
  <div align="center">
    
    <h1>Employee Registration Form</h1> 

  <form action="reg" method="get">
      <table cellpadding=15>
        <tr>
           <td>USER ID :</td>
            <td><input type="text" name="userid" placeholder="Type ID" required="required"></td>
         </tr>
         
        

	<tr> 
           <td>NAME :</td>
           <td><input type="text" name="name"></td>
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
           <td><input type="number" name="mobileno"></td>
        </tr>
          <tr>
          <td>Assign To Project: </td>
          <td><input type="text" name="pid" placeholder="Enter Project ID" require="required" >
          </td>
          </tr> 
                    
     </table> <br>      
         <div align=center>
            <input type="submit" value="REGISTER" >
             <input type="reset" value= "RESET"> 
     	</div>
    </form>
</div>
</body>
</html>