package byHimanshu;

import java.rmi.Naming;
import java.rmi.Remote;

public class Server {

	public static void main(String[] args) throws Exception{
		
		Remote r=new BankImpl();
		
		Naming.rebind("rmi://localhost:7000/him1",r);
	}
}
