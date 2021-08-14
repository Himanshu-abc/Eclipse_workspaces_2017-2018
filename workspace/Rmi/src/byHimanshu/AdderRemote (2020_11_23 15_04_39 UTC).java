package byHimanshu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
	
	public AdderRemote() throws RemoteException{
		super();
	}
	
	public int add(int x,int y) {
		return x+y;
	}
	
}
