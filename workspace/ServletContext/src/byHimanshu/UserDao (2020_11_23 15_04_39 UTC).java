package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public static Connection getConnection() {
	
		Connection con=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="System";
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
	
public static List<User> fetch() {
	
	List<User> li=new ArrayList<User>();
	
	try {
		
		Connection con=UserDao.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from csuser");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			
			User u=new User();
			
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setPassword(rs.getString(3));
			
			li.add(u);
		}
		pst.close();
		con.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	return li;
}
}
