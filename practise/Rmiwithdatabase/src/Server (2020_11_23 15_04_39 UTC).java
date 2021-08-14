import java.rmi.Naming;

public class Server {
	
	public static void main(String[]args) {
		
	try {
		Office stub=new OfficeRemote();
		
		Naming.rebind("rmi://localhost:6061/obj", stub);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}
}
