package com.app.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	public static Connection getConnection() {
		
		Connection con=null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
	    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
	}
	catch (Exception e) {
		System.out.println(e);
		}
	return con;
	}
	
	public int addEmployee(Employee ee) {
		
		int status=0;
		
		try {
		Connection con=getConnection();
		
		PreparedStatement pst=con.prepareStatement("insert into user905(name,password,email,country) values (?,?,?,?)");
		pst.setString(1, ee.getName());
		pst.setString(2, ee.getPassword());
		pst.setString(3, ee.getEmail());
		pst.setString(4, ee.getCountry());
		
		status=pst.executeUpdate();
		con.close();
		
		}catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public List<Employee> getEmployees() {
		
		List<Employee> l=new ArrayList<>();
		
		try {
			
			Connection con=getConnection();
			PreparedStatement pst=con.prepareStatement("select * from user905");
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				Employee ee=new Employee(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				l.add(ee);
			}
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}
	
	public int deleteEmployee(int id) {
		
		int status=0;
		try {
			
			Connection con=getConnection();
			
			PreparedStatement pst=con.prepareStatement("delete from user905 where id=?");
		    pst.setInt(1, id);	    
		    status=pst.executeUpdate();
			con.close();
			
		}catch (Exception e) {
		System.out.println(e);
		}
		return status;
	}
	
	public int updateEmployee(Employee ee) {
		
		int status=0;
		try {
			
			Connection con=getConnection();
			PreparedStatement pst=con.prepareStatement("update user905 set name=?,password=?,email=?,country=? where id=?");
			pst.setString(1, ee.getName());
			pst.setString(2, ee.getPassword());
			pst.setString(3, ee.getEmail());
			pst.setString(4, ee.getCountry());
			pst.setInt(5, ee.getId());
			
			status=pst.executeUpdate();
			con.close();
			
		}catch (Exception e) {
		 System.out.println(e);
		}
		return status;
	}
	
	public Employee getById(int id) {
		
		Employee ee = null;
		
		try {
			
			Connection con=getConnection();
			PreparedStatement pst=con.prepareStatement("select * from user905 where id=?");
			pst.setInt(1,id);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
			ee=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return ee;
	}
}
