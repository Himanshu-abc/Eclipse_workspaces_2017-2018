package prt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Third {

	public static void main(String[] args) {
	
		String s="E://fs.txt";
		File f=new File(s);
		
		try {
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			
			String h="this is world of programmers";
			bw.write(h);
			System.out.println("success");
			bw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
