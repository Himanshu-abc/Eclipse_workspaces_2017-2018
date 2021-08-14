import java.rmi.Naming;

public class Server {

	public static void main(String[] args) {
	
	try {
		Adder stub=new AdderRemote();
		
		Naming.rebind("rmi://127.0.0.1:6000/obj", stub);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
