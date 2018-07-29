package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.DelGPMBean;
import util.MNREGAConnection;



public class DelGPMDAO {
	
	private Connection con=null;
	private String sqlSelectGPM="select userid,name from gpm";
	private PreparedStatement pstmtSelectGPM=null;
	public DelGPMDAO() throws ClassNotFoundException, SQLException{
		con=MNREGAConnection.getConnection();
		pstmtSelectGPM=con.prepareStatement(sqlSelectGPM);
	}
	
	public Collection<DelGPMBean> getAllMembers() throws SQLException{
		Collection<DelGPMBean>list= new ArrayList<DelGPMBean>();
		ResultSet rs=pstmtSelectGPM.executeQuery();
		while(rs.next())
		{
			DelGPMBean p= new DelGPMBean(rs.getString(1), rs.getString(2));
			list.add(p);
		}
		return list;
	}
	PreparedStatement pst;

	public boolean deleteGPM(String uid)
	{
		boolean f = false;
		try{
			pst = con.prepareStatement("delete from gpm where userid= ?");
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
