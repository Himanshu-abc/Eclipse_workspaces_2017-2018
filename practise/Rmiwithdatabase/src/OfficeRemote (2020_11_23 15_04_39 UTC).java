import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OfficeRemote extends UnicastRemoteObject implements Office{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected OfficeRemote() throws RemoteException {
		super();
	}

	@Override
	public List<Employee> list() throws RemoteException {
		
		List<Employee> l=new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
			
			PreparedStatement pst=con.prepareStatement("select * from user905");
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				
			Employee e=new Employee(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
			
			l.add(e);
			}
			
			con.close();
			
		}catch (Exception e) {
		  e.getMessage();
		}
		
		return l;
	}

	

}
