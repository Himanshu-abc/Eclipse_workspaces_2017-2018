package prt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propertyexample2 {

	public static void main(String[] args) {
		
	Properties p=System.getProperties();
	
	p.setProperty("skills", "java,python");
	p.setProperty("column", "1,2,3,4,5");
	
	try {
		p.store(new FileWriter("src/prt/db.properties"), "skills set of user");
		
		System.out.println("success");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
