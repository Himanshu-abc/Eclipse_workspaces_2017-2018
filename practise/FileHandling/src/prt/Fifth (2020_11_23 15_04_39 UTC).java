package prt;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fifth {

	public static void main(String[] args) {
		
		String s="E://fos.txt";
		
		File f=new File(s);
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			String w="hello this is world of hackers";
			
			byte[] b=w.getBytes();
			
			bos.write(b);
				
			System.out.println("success");
			
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
