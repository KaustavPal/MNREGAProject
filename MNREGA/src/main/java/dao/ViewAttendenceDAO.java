package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.AttendenceBean;

public class ViewAttendenceDAO {
	public static Connection getMySQLConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnrega","root","8100472356A");
		return con1;
		
	}
	Connection con;
	PreparedStatement pst;
	public Collection<AttendenceBean> getAllMembers(String name)throws SQLException
	{
		
			
				try {
					con = getMySQLConnection();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
