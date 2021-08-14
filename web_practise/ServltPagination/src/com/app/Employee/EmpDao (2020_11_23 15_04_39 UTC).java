package com.app.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	public List<Employee> getEmplpoyees(int start,int total){
		
		List<Employee> l=new ArrayList<>();
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
			
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		PreparedStatement pst=con.prepareStatement("select * from emp limit "+(start-1)+","+total);
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			Employee ee=new Employee();
			ee.setId(rs.getInt(1));
			ee.setName(rs.getString(2));
			ee.setSalary(rs.getDouble(3));
			
			l.add(ee);
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return l;
		}

}
