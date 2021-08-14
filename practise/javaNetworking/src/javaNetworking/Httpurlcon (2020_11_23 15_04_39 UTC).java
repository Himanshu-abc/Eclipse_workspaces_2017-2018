package javaNetworking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Httpurlcon {

	public static void main(String[] args) {
	
		try {
			URL u=new URL("http://www.javatpoint.com/java-tutorial");
			HttpURLConnection huc=(HttpURLConnection)u.openConnection();
			
			for(int i=0;i<8;i++) {
				
				System.out.println(huc.getHeaderFieldKey(i)+" "+huc.getHeaderField(i));
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
