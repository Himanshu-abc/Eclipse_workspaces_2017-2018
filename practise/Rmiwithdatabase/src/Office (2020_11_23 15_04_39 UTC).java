import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Office extends Remote{
	
	public List<Employee> list() throws RemoteException;

}
