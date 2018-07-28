package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.C_ProjectBean;

public class C_ProjectDAO {
	public static Connection getMySQLConnection()throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnrega","root","8100472356A");
		return con1;		
	}
	Connection con;
	public boolean insertData(C_ProjectBean user)
	{
		boolean f= false;
		try
		{
			 con = getMySQLConnection();
			PreparedStatement pst= con.prepareStatement("insert into project values(?,?,?,?,?,?)");
			
			
			{
				pst.setString(1, user.getPid());
				pst.setString(2, user.getPname());
				pst.setString(3, user.getPlocation());
				pst.setString(4, user.getPduration());
				pst.setString(5, user.getPhead());
				pst.setString(6, user.getPgpm());
				
				
				
				int il=pst.executeUpdate();
				if(il>0)
					f=true;
				
			}
		}catch(Exception e){System.out.println(e.toString());}
		finally
		{
			try
			{
				con.close();
				
			}
			
			catch (SQLException e)
			
			{
				e.printStackTrace();
			}
		}
		return f;
	}

}
