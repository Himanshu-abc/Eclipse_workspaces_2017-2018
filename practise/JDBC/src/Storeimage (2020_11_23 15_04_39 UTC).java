import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Storeimage {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "apocalypse");
			
			DatabaseMetaData dbm=con.getMetaData();
			
			System.out.println(dbm.getDatabaseProductName());
			System.out.println( dbm.getDatabaseProductVersion());
			System.out.println(dbm.getDatabaseMajorVersion());
			System.out.println(dbm.getDriverName());
		    System.out.println(dbm.getURL());
			
			String sql="insert into imgtable values(?,?)";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, 1);
			
			FileInputStream fis=new FileInputStream("E:\\memory card\\captions,images\\527.jpg");
			
			pst.setBinaryStream(2, fis, fis.available());
			
			int i=pst.executeUpdate();
			
			System.out.println(i+" rows affected");
			
			con.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
