import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String s1="",s2="";
			while(!s1.equals("stop")) {
				
				s1=dis.readUTF();
				System.out.println("Client says : "+s1);
				
				s2=br.readLine();
				dos.writeUTF(s2);
				dos.flush();
			}
			
			dis.close();
			s.close();
			ss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
}
	}