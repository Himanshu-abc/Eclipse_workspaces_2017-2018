package prt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class First {

	public static void main(String[] args){
		
	String path="E://fos.txt";

	File f=new File(path);
	
	System.out.println(f.exists());
	
	try {
		FileOutputStream fos=new FileOutputStream(f);
		
		String s="this is world of programmers";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
		   fos.write(ch[i]);
		}
		
		System.out.println("success");
		
		fos.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	}
}
