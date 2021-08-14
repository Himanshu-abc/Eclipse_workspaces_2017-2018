package com.xyz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public static Connection getConnection() {
		
		Connection con=null;
	
	    try {
	    	Class.forName("oracle.jdbc.OracleDriver");
	        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
	    	
	    }catch (Exception e) {
            System.out.println(e);
		}
	    return con;
	}
	
	public int addUser(User u) {
		
		int status=0;
		try {
			Connection con=getConnection();
			PreparedStatement pst=con.prepareStatement("insert into user432 values(?,?,?)");
			
			pst.setString(1,u.getName());
			pst.setString(2,u.getEmail());
			pst.setString(3,u.getPassword());
			
			status=pst.executeUpdate();
			
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public List<User> getUsers(){
		
		List<User> l=new ArrayList<User>();
		
		try {
			Connection con=getConnection();
			
			PreparedStatement pst=con.prepareStatement("select * from user432");
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				
			User u=new User();
			
			u.setName(rs.getString(1));
			u.setEmail(rs.getString(2));
			u.setPassword(rs.getString(3));
			
			l.add(u);
			}
			con.close();
		}catch (Exception e) {
		System.out.println(e);
		}
		return l;
	}
	
	public User getByName(String name) {
		
		  User u=new User();
		try {
			
			Connection con=getConnection();
			
			PreparedStatement pst=con.prepareStatement("select * from user432 where name=?");
			pst.setString(1,name);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				u.setName(rs.getString(1));
				u.setEmail(rs.getString(2));
				u.setPassword(rs.getString(3));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return u;
		}
	
	public int deleteUser(String name) {
		
		int status=0;
		
		try {
			Connection con=getConnection();
			
			PreparedStatement pst=con.prepareStatement("delete from user432 where name=?");
			pst.setString(1, name);
			
			status=pst.executeUpdate();
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	public int updateUser(User u) {
		
		int status=0;
		
		try {
			Connection con=getConnection();
			
			PreparedStatement pst=con.prepareStatement("update user432 set email=? ,pass=? where name=?");
			
		    pst.setString(1,u.getEmail());
		    pst.setString(2,u.getPassword());
		    pst.setString(3,u.getName());
		    
		    status=pst.executeUpdate();
		    con.close();
		    
		}catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
}