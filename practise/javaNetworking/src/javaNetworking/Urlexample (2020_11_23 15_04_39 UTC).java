package javaNetworking;

import java.net.MalformedURLException;
import java.net.URL;

public class Urlexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		URL u=new URL("http://www.javatpoint.com/java-tutorial");
		
		System.out.println(u.getProtocol());
		System.out.println(u.getPath());
		System.out.println(u.getHost());
		System.out.println(u.getDefaultPort());
		System.out.println(u.getPort());
		System.out.println(u.getFile());
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	}

}
