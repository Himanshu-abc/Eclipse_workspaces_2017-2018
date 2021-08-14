package javaNetworking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlconnectionExample {

	public static void main(String[] args) {
     try {  
		URL u=new URL("http://www.javatpoint.com");
		URLConnection uc=u.openConnection();
		
		InputStream is=uc.getInputStream();
		int i;
		
		while((i=is.read())!=-1) {
			System.out.print((char)i);
		}
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
