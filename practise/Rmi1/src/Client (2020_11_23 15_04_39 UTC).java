import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
	
	  try {
		Adder stub=(Adder) Naming.lookup("rmi://127.0.0.1:6000/obj");
		
		System.out.println(stub.add(34,4));
		
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
		e.printStackTrace();
	}
	  
	  
	}
}
