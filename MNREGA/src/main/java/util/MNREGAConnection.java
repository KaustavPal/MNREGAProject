package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MNREGAConnection {
	public static Connection getConnection()
	{
		try
		{
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","soham");
		return con;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}
}
