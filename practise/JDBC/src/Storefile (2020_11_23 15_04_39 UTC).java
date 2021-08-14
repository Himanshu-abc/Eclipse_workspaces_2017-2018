import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Storefile {

	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "apocalypse");
			
			PreparedStatement pst=con.prepareStatement("insert into filetable values (?,?)");
			
			pst.setInt(1, 1);
			
			File f=new File("E:\\extra .txt");
			FileReader fr=new FileReader(f);
			
			pst.setCharacterStream(2,fr,(int)f.length()); 
			
			fr.close();
			
			int i=pst.executeUpdate();
			
			System.out.println(i+" rows affected");
			
			con.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}