package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.ERegBean;
import util.MNREGADataSource;

public class SearchEmployeeDAO {
	Connection con;
	PreparedStatement pst;
	public Collection<ERegBean> getAllMembers(String name)throws SQLException
	{


		con = MNREGADataSource.getConnection();
		pst = con.prepareStatement("select userid,name,gender,dob,address,mobileno,pid from employee where name=?");
		pst.setString(1,name);
		Collection<ERegBean>list= new ArrayList<ERegBean>();
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			ERegBean p= new ERegBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			list.add(p);
		}
		return list;
	}
}
