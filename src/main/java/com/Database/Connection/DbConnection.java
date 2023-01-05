package com.Database.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public Connection createConnection() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String dbname = "root";
		String dbpass = "#Goutham@422";
		String selectQuery = "SELECT * FROM EmployeeDetails";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,dbname,dbpass);
		return conn;
	}
}
