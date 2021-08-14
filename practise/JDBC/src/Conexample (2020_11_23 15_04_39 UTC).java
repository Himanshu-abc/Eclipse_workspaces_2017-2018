import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexample {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
			
			String sql="select * from emp";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
