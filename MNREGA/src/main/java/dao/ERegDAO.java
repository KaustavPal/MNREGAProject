package dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.ERegBean;
import util.MNREGAConnection;


public class ERegDAO {
	
	Connection con;
	PreparedStatement pst;
	public boolean insertData(ERegBean ob)
	{
		boolean f= false;
		try
		{
			
				con = MNREGAConnection.getConnection();
				pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
		
				pst.setString(1, ob.getUserid());
				pst.setString(2, ob.getName());
				pst.setString(3, ob.getGender());
				pst.setString(4, ob.getDob());
				pst.setString(5, ob.getAddress());
				pst.setString(6, ob.getMobileno());
				pst.setString(7, ob.getPid());
				
				
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
