package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.BDOLoginBean;
import util.MNREGADataSource;


public class BDOLoginDAO {
	Connection con;
	PreparedStatement pst;
	
	public boolean login(String uid, String pw)
	{
		boolean f=false;  
		try{ 
		con = MNREGADataSource.getConnection();
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
