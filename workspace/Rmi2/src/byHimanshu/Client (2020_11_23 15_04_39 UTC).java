package byHimanshu;

import java.rmi.Naming;
import java.util.List;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Bank b1=(Bank) Naming.lookup("rmi://localhost:7000/him1");
		
	    List<Customer> cl=b1.getCustomer();
	   
	    for(Customer c: cl) {
	    	
	    	System.out.println(c.getAcc_no()+" "+c.getFirstname()+" "+c.getLastname()+" "+c.getEmail()+" "+c.getEmail());
	    	
	    }

	}

}
