package byHimanshu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankImpl  extends UnicastRemoteObject implements Bank {

	public BankImpl() throws RemoteException{
	}
	public List<Customer> getCustomer(){
	
	List<Customer> list=new ArrayList<Customer>();
	
	try {
		
		Customer c=new Customer();
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "apocalypse");
		
		PreparedStatement pst=con.prepareStatement("select * from customer400");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			
			c.setAcc_no(rs.getInt(1));
			
			c.setFirstname(rs.getString(2));
			
			c.setLastname(rs.getString(3));
			
			c.setEmail(rs.getString(4));
			
			c.setAmount(rs.getFloat(5));
			
			list.add(c);	
		}
		con.close();
		
	}catch (Exception e) {
	e.printStackTrace();
	}
	return list;
	}
}
