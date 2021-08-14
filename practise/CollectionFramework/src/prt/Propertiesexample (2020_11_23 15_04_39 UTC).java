package prt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertiesexample {

	public static void main(String[] args) {
	
		try {
			FileReader fr=new FileReader("src/prt/db.properties");
			
			Properties p=new Properties();
			p.load(fr);
			
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}  
	}

