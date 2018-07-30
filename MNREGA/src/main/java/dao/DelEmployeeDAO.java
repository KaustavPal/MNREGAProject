package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.DelEmployeeBean;
import util.MNREGADataSource;



public class DelEmployeeDAO {
	
	private Connection con=null;
	private String sqlSelectGPM="select userid,name from employee";
	private PreparedStatement pstmtSelectGPM=null;
	public DelEmployeeDAO() throws ClassNotFoundException, SQLException{
		con=MNREGADataSource.getConnection();
		pstmtSelectGPM=con.prepareStatement(sqlSelectGPM);
	}
	
	public Collection<DelEmployeeBean> getAllMembers() throws SQLException{
		Collection<DelEmployeeBean>list= new ArrayList<DelEmployeeBean>();
		ResultSet rs=pstmtSelectGPM.executeQuery();
		while(rs.next())
		{
			DelEmployeeBean p= new DelEmployeeBean(rs.getString(1), rs.getString(2));
			list.add(p);
		}
		return list;
	}
	PreparedStatement pst;

	public boolean deleteEmployee(String uid)
	{
		boolean f = false;
		try{
			pst = con.prepareStatement("delete from employee where userid= ?");
			pst.setString(1, uid);
			int i1 = pst.executeUpdate();
			if(i1>0)
				f=true;
		}
		catch(Exception e){System.out.print(e.toString());}
		finally
		{
			try{
				con.close();
				pst.close();
			} catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return f;
		}

}
