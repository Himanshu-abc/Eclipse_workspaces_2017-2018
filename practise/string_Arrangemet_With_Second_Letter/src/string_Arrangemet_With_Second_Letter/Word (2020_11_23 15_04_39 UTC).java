package string_Arrangemet_With_Second_Letter;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Word {

	public static void main(String[] args) {

		String[] sa=new String[] {"my","name","is","namit"};
		
		Dictionary<String,Character> d=new Hashtable<>();
		
		for(int i=0;i<sa.length;i++) {
			
			String s = sa[i];			
			d.put(s.substring(1),s.charAt(0));
		}
		
		Enumeration<String> e=d.keys();
		
		while(e.hasMoreElements()) {
			String sq=e.nextElement();
			System.out.println(d.get(sq)+sq);
		}
		
	}
	
}
