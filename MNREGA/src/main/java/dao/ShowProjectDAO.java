package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import bean.C_ProjectBean;
import util.MNREGAConnection;



public class ShowProjectDAO {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/mnrega";
	private String user="root";
	private String pass="8100472356A";
	
	private Connection con=null;
	private String sqlSelectProject="select pid,pname,plocation,pduration,phead,pgpm from project";
	private PreparedStatement pstmtSelectProject=null;
	
	
	
	public ShowProjectDAO() throws ClassNotFoundException, SQLException{
		con=MNREGAConnection.getConnection();
		pstmtSelectProject=con.prepareStatement(sqlSelectProject);

		
	}
	public Collection<C_ProjectBean> getAllProject() throws SQLException{
		Collection<C_ProjectBean>list= new ArrayList<C_ProjectBean>();
		ResultSet rs=pstmtSelectProject.executeQuery();
		while(rs.next())
		{
			C_ProjectBean p= new C_ProjectBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			list.add(p);
		}
		return list;

}
}
