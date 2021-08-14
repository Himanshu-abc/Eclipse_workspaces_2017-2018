package prt;

public class Genericexample {
	
	public <T> void printArray(T [] t) {
		
		for(T tq:t) {
		System.out.print(tq+" ");	
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
		Integer [] i=new Integer[] {2,4,6,8,10};
		
		String [] s=new String[] {"a","b","c","d","e"};
		
	Genericexample ge=new Genericexample();
	ge.printArray(i);
	ge.printArray(s);
	}
}
