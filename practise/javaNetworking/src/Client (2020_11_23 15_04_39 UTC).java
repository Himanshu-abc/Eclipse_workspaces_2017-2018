import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			Socket s=new Socket("localhost",6666);
			
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String s1="",s2="";
			while(s1!="stop") {
			
				s2=br.readLine();
				dos.writeUTF(s2);
				dos.flush();
				
				s1=dis.readUTF();
				System.out.println("Server says : "+s1);
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
