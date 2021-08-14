import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieveimage {

	public static void main(String[] args) {
	
		try {
			
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
		
		PreparedStatement pst=con.prepareStatement("select * from imgtable");
		
		ResultSet rs=pst.executeQuery();
		
		if(rs.next()) {
			
			System.out.println(rs.getInt(1));
			
			Blob b=rs.getBlob(2);
			
			byte ba[]=b.getBytes(1,(int)b.length());
			
			FileOutputStream fos=new FileOutputStream("E:\\2.jpg");
			
			fos.write(ba);
			fos.close();
		}
		
		con.close();
		System.out.println("success");
	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}