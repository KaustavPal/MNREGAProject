package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.AddGPMBean;
import util.MNREGAConnection;

public class GPMLoginDAO {

	Connection con;
	PreparedStatement pst;
	
	public AddGPMBean login(String uid, String pw)throws SQLException, ClassNotFoundException
	{
		//boolean f=false;  

		con = MNREGAConnection.getConnection();
		pst=con.prepareStatement(  
		"select userid,password,name from gpm where userid=? and password=?");  
		pst.setString(1,uid);  
		pst.setString(2,pw);  
		      
		ResultSet rs=pst.executeQuery(); 
		if(rs.next())
		{
			AddGPMBean c=new AddGPMBean(rs.getString(1),null,rs.getString(3),null,null,null,null,null);
			return c;
		}
		//f=rs.next();
		else
			return null;
		          
}

}
