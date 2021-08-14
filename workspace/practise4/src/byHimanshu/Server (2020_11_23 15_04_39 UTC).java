package byHimanshu;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
	
		try {
			
			ServerSocket ss=new ServerSocket(6668);
			
			Socket s=ss.accept();
			
			String ser,cli;
			
			do {	
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
			
			cli=dis.readUTF();
			
			System.out.println("client says : "+cli);
			
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		    ser=br.readLine();
			
			dout.writeUTF(ser);
			dout.flush();
			
			}
			while(ser.equals("quit"));
			
			
			s.close();
			ss.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
