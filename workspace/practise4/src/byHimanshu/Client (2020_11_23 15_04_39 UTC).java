package byHimanshu;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			
			Socket s=new Socket("127.0.0.1", 6668);
			
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String s1,s2;
			
			do {
		       	s1=br.readLine();
				dout.writeUTF(s1);
				
				dout.flush();
				
				s2=din.readUTF();
				System.out.println("server says : "+s2);
				
			}while(!s1.equals("quit"));
			
		   br.close();
		   din.close();
		   dout.close();
		   s.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}