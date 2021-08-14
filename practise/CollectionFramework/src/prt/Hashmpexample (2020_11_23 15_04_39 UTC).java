package prt;

import java.util.HashMap;
import java.util.Map;

public class Hashmpexample {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1,"linda");
		hm.put(8,"john");
	    hm.put(4,"sdbcbvd");
	    
	    for(Map.Entry<Integer, String> kv:hm.entrySet()) {
	    	System.out.println(kv.getKey()+" "+kv.getValue());
	    }
	}
}
