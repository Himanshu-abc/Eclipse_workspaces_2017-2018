package com.xyz.t1_deomRest_jersey;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienDao {
	
	Connection con;
	
	public AlienDao() {
		
		String url="jdbc:mysql://localhost:3306/restdb";
		String user="root";
		String password="root";
		
		try {
			
	    Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Alien> getAliens() {
		
		List<Alien> alist = new ArrayList<Alien>();
		
		String query= "select * from alien";
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
		    ResultSet rs = pst.executeQuery();
			
		    while(rs.next()) {
		    	
		    	Alien a=new Alien();
		    	a.setId(rs.getInt(1));
		    	a.setName(rs.getString(2));
		    	a.setPoints(rs.getInt(3));
		    	
		    	alist.add(a);
		    }
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return alist;
	}
	
	public Alien getAlien(int id) {
		
		String query= "select * from alien where id=?";
		Alien a=new Alien();
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, id);
		    ResultSet rs = pst.executeQuery();
		    	
		    if(rs.next()) {
		    	
		    	a.setId(rs.getInt(1));
		    	a.setName(rs.getString(2));
		    	a.setPoints(rs.getInt(3));
		    }
		    } 
		catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	public void create(Alien a) {
		
		String query="insert into alien values (?,?,?)";
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, a.getId());
			pst.setString(2, a.getName());
			pst.setInt(3, a.getPoints());
			
			pst.executeUpdate();
			
		    } 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
    public void update(Alien a) {
		
		String query="update alien set name=?,points=? where id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1, a.getName());
			pst.setInt(2, a.getPoints());
			pst.setInt(3, a.getId());
			
			pst.executeUpdate();
			
		    } 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		
     String query="delete from alien where id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, id);
			
			pst.executeUpdate();
			
		    } 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}