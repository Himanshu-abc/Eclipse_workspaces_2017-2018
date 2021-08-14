package byHimanshu;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Bank extends Remote {

	public List<Customer> getCustomer() throws RemoteException; 
}
