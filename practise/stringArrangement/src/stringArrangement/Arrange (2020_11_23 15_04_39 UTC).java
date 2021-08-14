package stringArrangement;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Arrange {

	public static void main(String[] args) {

		String[] sa=new String[] {"my","name","is","namit"};
		
		Set<String> s = new TreeSet<>();
		
		for(String sx:sa) {
			s.add(sx);
		}
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
