package com.aia.op.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getConn() throws SQLException {
		String jdbcUrl = "jdbc:apache:commons:dbcp:pool";
		
		return DriverManager.getConnection(jdbcUrl);
	}
}
