package com.Connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc_connection {
	
	public static Connection getConnection() throws ClassNotFoundException, IOException, SQLException {
		
		FileInputStream fis = new FileInputStream("App.properties");
		
		Properties p = new Properties();
		
		p.load(fis);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = p.getProperty("url");
		
		String username = p.getProperty("uname");
		
		String password = p.getProperty("pass");
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		return con;
		
		
	}

}
