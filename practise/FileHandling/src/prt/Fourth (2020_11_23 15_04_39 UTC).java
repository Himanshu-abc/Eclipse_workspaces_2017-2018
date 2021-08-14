package prt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fourth {

	public static void main(String[] args) {
	
		String s="E://fos.txt";
		
		File f=new File(s);
		
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			int i = 0;
			
			while((i=br.read())!=-1) {
				System.out.print((char)i);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
