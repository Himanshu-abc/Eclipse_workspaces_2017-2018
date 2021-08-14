package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
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
	
	public static boolean validate(String u,String p) {
	
		boolean r=false;
		
		try {
		Connection con=LoginDao.getConnection();
		
        PreparedStatement pst=con.prepareStatement("select * from user905 where name=? and password=?");
		
		pst.setString(1, u);
		pst.setString(2, p);
		
		ResultSet rs=pst.executeQuery();
		
		if(rs.next()) {
			r=true;
		}
		
		con.close();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}
