package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider implements Provider{
	
private static Connection con=null;
	
	static {
		try {
			
			Class.forName(driver);
			
			con=DriverManager.getConnection(url, user, password);
			
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
	
		return con;
	}

}
