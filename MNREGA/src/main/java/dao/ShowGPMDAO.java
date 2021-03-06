package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.AddGPMBean;
import util.MNREGADataSource;

public class ShowGPMDAO {
	Connection con;
	PreparedStatement pst;
	public Collection<AddGPMBean> getAllMembers()throws SQLException
	{
		con=MNREGADataSource.getConnection();
		pst = con.prepareStatement("select userid,password,name,gender,dob,address,mobileno,emailid from gpm");
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
