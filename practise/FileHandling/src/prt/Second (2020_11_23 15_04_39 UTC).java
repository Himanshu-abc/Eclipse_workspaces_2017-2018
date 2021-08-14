package prt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Second {

	public static void main(String[] args) {
	
		String s="E://fos.txt";
		
		File f=new File(s);
		
		try {
			FileInputStream fis=new FileInputStream(f);
			
			int i=0;
			
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
