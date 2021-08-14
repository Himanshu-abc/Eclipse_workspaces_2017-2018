package byHimanshu;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
  
public class Download {

	public static void main(String[]args) {
	
	try {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "apocalypse");
		
		PreparedStatement pst=con.prepareStatement("Select * from ft");
		
		ResultSet rs=pst.executeQuery();
		
         rs.next();
			
			Clob c=rs.getClob(2);
			
			Reader r= c.getCharacterStream();
			
			int i=1;
			String loc="E:\\clob"+i+".txt";
			FileWriter fw=new FileWriter(loc);
			i++;
			  
			int i2;
			while((i2=r.read())!=-1) {
				fw.write((char)i2);
			}
			System.out.println("everything ok");
			
			fw.close();
			con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}