package com.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	public static boolean login(User u) {
		
		boolean status=false;
		
		try {
		
			Connection con=ConnectionProvider.getConnection();
			
			PreparedStatement pst=con.prepareStatement("select * from user432  where email=? and pass=?");
			
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPass());
			
			ResultSet rs=pst.executeQuery();
			
			status=rs.next();
			
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
