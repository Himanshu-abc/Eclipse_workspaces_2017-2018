package pract;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class First1 {

	public static void main(String[] args) {
	
		String OSname=System.getProperty("os.name");
		System.out.println(OSname);
		String IP="";
		try {
			 IP=InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(IP);
	}
}
