package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.C_ProjectBean;
import bean.ERegBean;
import util.MNREGADataSource;

public class SearchEmployeeProjectDAO {
	Connection con;
	PreparedStatement pst,pst1;
	public Collection<ERegBean> getAllMembers(String name)throws SQLException
	{
				con=MNREGADataSource.getConnection();
				pst = con.prepareStatement("select userid,name,gender,dob,address,mobileno,pid from employee where pid=?");
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
	/*public Collection<C_ProjectBean> getPname(String name)throws SQLException
	{
		
			
				try {
					con1 = MNREGAConnection.getConnection();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pst1 = con1.prepareStatement("select pname from project where pid=?");
				pst1.setString(1,name);
				Collection<C_ProjectBean>list1= new ArrayList<C_ProjectBean>();
				ResultSet rs=pst1.executeQuery();
				while(rs.next())
				{
					C_ProjectBean b= new C_ProjectBean(null,rs.getString(2),null,null,null,null);
					list1.add(b);
				}
				return list1;
		
	}
*/
}
