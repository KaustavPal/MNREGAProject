package dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.AddGPMBean;
import util.MNREGADataSource;



public class AddGPMDAO {
	Connection con;
	PreparedStatement pst;
	public boolean insertData(AddGPMBean ob)
	{
		boolean f= false;
		try
		{
			
				con = MNREGADataSource.getConnection();
				pst = con.prepareStatement("insert into gpm values(?,?,?,?,?,?,?,?)");
		
				pst.setString(1, ob.getUserid());
				pst.setString(2, ob.getPassword());
				pst.setString(3, ob.getName());
				pst.setString(4, ob.getGender());
				pst.setString(5, ob.getDob());
				pst.setString(6, ob.getAddress());
				pst.setString(7, ob.getMobileno());
				pst.setString(8, ob.getEmailid());
				
				
				int i1=pst.executeUpdate();
				if(i1>0)
					f=true;
				
		}catch(Exception e){System.out.print(e.toString());}
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
