package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.app.bean.ConnectionProvider;
import com.app.bean.User;

public class UserDao {
	
	public static int registerUser(User u) {
		 int status=0;
		
		try {
			
			Connection con=ConnectionProvider.getConnection();
			
			PreparedStatement pst=con.prepareStatement("insert into user432 values (?,?,?)");
			
			pst.setString(1, u.getName());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPass());
			
			status=pst.executeUpdate();
			
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
