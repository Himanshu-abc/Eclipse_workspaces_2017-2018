package prt;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sixth {

	public static void main(String[] args) {
	
	String s="E://fs.txt";
	
	File f=new File(s);
	
	try {
		FileInputStream fis=new FileInputStream(f);
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int i;
		while((i=bis.read())!=-1) {
			System.out.print((char)i);
		}
		bis.close();
		fis.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}