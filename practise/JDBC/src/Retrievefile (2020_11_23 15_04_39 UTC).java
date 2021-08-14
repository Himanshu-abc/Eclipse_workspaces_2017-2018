import java.io.File;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrievefile {

	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "apocalypse");
			
			PreparedStatement pst=con.prepareStatement("select * from filetable");
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				
				Clob c=rs.getClob(2);
				Reader r=c.getCharacterStream();
				
				File f=new File("E:\\a.txt");
				FileWriter fw=new FileWriter(f);
				
				int i=0;
				while((i=r.read())!=-1) {
					fw.write((char)i);
				}
				fw.close();
			}
			
			con.close();
			
			System.out.println("success");
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
