package javaNetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {

	public static void main(String[] args) {
	
		try {
			InetAddress ia=InetAddress.getByName("www.javatpoint.com");
			
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getAddress());
			System.out.println(ia.getHostName());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
