package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Employee;

public class EmployeeDao {
	
	public static Connection getConnection() {
		
	Connection con=null;
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="apocalypse";
	String driver="oracle.jdbc.OracleDriver";
	
	try {
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, password);	
	}catch (Exception e) {
		e.printStackTrace();
	}
	return con;
	}

public static int save(Employee e) {
	
	int status=0;
	try {
	Connection con=EmployeeDao.getConnection();
	
	PreparedStatement pst=con.prepareStatement("insert into register values (?,?,?,?,?)");
	
	pst.setString(1, e.getName());
	pst.setString(2, e.getPassword());
	pst.setString(3, e.getEmail());
	pst.setString(4, e.getSex());
	pst.setString(5, e.getCountry());
	
	status=pst.executeUpdate();
	
	con.close();
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	return status;
}
public static List<Employee> viewAll (){
	
	List<Employee> list=new ArrayList<Employee>();
	
	try {
		Connection con=EmployeeDao.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from register");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			
			Employee ee=new Employee();
			
			ee.setName(rs.getString(1));
			ee.setPassword(rs.getString(2));
			ee.setEmail(rs.getString(3));
			ee.setSex(rs.getString(4));
			ee.setCountry(rs.getString(5));
			
			list.add(ee);
		}
		
		con.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	return list;
}

public static Employee getbyName(String name) {

	Employee ee=new Employee();
	
	try {
		
		Connection con=EmployeeDao.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from register where name=?");
		
		pst.setString(1, name);
		
		ResultSet rs= pst.executeQuery();
		
		while(rs.next()) {
			
			ee.setName(rs.getString(1));
		    ee.setPassword(rs.getString(2));
		    ee.setEmail(rs.getString(3));
		    ee.setSex(rs.getString(4));
		    ee.setCountry(rs.getString(5));
		}
		con.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	return ee;
}
public static int update (Employee e) {
	
	int status=0;
	
	try {
		Connection con=EmployeeDao.getConnection();
		
		PreparedStatement pst=con.prepareStatement("update register set password=?,email=?,sex=?,country=? where name=?");
		
		pst.setString(1, e.getPassword());
		pst.setString(2, e.getEmail());
        pst.setString(3, e.getSex());
        pst.setString(4, e.getCountry());
        pst.setString(5, e.getName());
         		
		status=pst.executeUpdate();
		
		con.close();
	}catch (Exception ex) {
		ex.printStackTrace();
	}
	return status;
}
public static int delete(String name) {
	int status=0;
	
	try {
		Connection con=EmployeeDao.getConnection();
		
		PreparedStatement pst=con.prepareStatement("delete from register where name = ? ");
		
		pst.setString(1, name);
		
		status=pst.executeUpdate();
		
		con.close();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return status;
}
}
