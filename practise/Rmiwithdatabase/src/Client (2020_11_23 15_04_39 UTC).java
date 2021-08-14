import java.rmi.Naming;
import java.util.List;

public class client {
	
	public static void main(String [] args) {
	
		try {
			Office stub=(Office) Naming.lookup("rmi://localhost:6061/obj");
			
			List<Employee> lst= stub.list();
			
			for(Employee ee:lst) {
				
				System.out.println(ee.getId()+" "+ee.getName()+" "+ee.getPassword()+" "+ee.getEmail()+" "+ee.getCountry());
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
