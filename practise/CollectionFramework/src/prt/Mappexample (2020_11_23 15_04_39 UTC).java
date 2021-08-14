package prt;

import java.util.HashMap;
import java.util.Map;

public class Mappexample {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer,String>();
		
		m.put(1,"raja");
		m.put(2,"altaf");
		m.put(4, "yogendra");
        m.put(3, "wolf");
        
       for(Map.Entry<Integer,String> ma:m.entrySet()) {
    	   System.out.println(ma.getKey()+" "+ma.getValue());
       }
	}

}
