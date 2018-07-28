package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.AddGPMBean;



public class SearchGPMDAO {

	public static Connection getMySQLConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnrega","root","8100472356A");
		return con1;
		
	}
	Connection con;
	PreparedStatement pst;
	public Collection<AddGPMBean> getAllMembers(String name)throws SQLException
	{
		
			
				try {
					con = getMySQLConnection();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pst = con.prepareStatement("select userid,password,name,gender,dob,address,mobileno,emailid from gpm where name=?");
				pst.setString(1,name);
				Collection<AddGPMBean>list= new ArrayList<AddGPMBean>();
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					AddGPMBean p= new AddGPMBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
					list.add(p);
				}
				return list;
		
	}
}
