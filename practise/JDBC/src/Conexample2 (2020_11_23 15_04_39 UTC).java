import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Conexample2 {
	
	public static void main(String[] args) {
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amit","root","root");
		
		DatabaseMetaData dbmd=con.getMetaData();  
		  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		
		PreparedStatement pst=con.prepareStatement("select * from emp");
		
		ResultSet rs=pst.executeQuery();
		
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
		
		while(rs.next()) {
			System.out.println("data : "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
		}
		
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
		
	}
}