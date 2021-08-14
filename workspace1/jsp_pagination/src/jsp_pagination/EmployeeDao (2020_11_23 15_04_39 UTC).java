package jsp_pagination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public static Connection getConnection() {
	
		Connection con=null;
		
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		String driver="com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
			
			con=DriverManager.getConnection(url, user, password);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static List<Employee> fetch(int start, int total){
		
		List<Employee> list=new ArrayList<Employee>();
		
		try {
			
			Connection con=EmployeeDao.getConnection();
			
			PreparedStatement pst=con.prepareStatement("select * from emp limit "+(start-1)+" , "+total);
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
			
				Employee e=new Employee();
				
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				
				list.add(e);
			}
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
