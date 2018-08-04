package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.AttendenceBean;
import util.MNREGADataSource;

public class ViewAttendenceDAO {
	Connection con;
	PreparedStatement pst;
	public Collection<AttendenceBean> getAllMembers(String name)throws SQLException
	{
		con=MNREGADataSource.getConnection();
		pst = con.prepareStatement("select userid, count(*) from attendence where userid=?");
		pst.setString(1,name);
		Collection<AttendenceBean>list= new ArrayList<AttendenceBean>();
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			AttendenceBean p= new AttendenceBean(rs.getString(1), rs.getString(2));
			list.add(p);
		}
		return list;

	}

}
