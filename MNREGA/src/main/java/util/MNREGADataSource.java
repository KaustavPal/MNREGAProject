package util;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class MNREGADataSource {
	private static HikariConfig hikariConfig=new HikariConfig();
	private static HikariDataSource hikariDataSource;
	static
	{
		hikariConfig.setDriverClassName("org.postgresql.Driver");
		hikariConfig.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
		hikariConfig.setUsername("postgres");
		hikariConfig.setPassword("soham");
		hikariConfig.addDataSourceProperty( "cachePrepStmts" , "true" );
        hikariConfig.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        hikariConfig.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        hikariDataSource=new HikariDataSource(hikariConfig);
	}
	public static Connection getConnection() throws SQLException
	{
		return hikariDataSource.getConnection();
	}
}
