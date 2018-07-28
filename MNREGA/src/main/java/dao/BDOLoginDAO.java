package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.BDOLoginBean;


public class BDOLoginDAO {
	public static Connection getMySQLConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnrega","root","8100472356A");
		return con1;
		
	}
	Connection con;
	PreparedStatement pst;
	
	public boolean login(String uid, String pw)
	{
		boolean f=false;  
		try{ 
		con = getMySQLConnection();
		pst=con.prepareStatement(  
		"select userid,password from bdo where userid=? and password=?");  
		pst.setString(1,uid);  
		pst.setString(2,pw);  
		      
		ResultSet rs=pst.executeQuery();  
		f=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return f;  
		} 
}
