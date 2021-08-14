package pract;

public class First {
	
	public static String stringAppend () {
		
		String s="java";
		
		for(int i=0;i<10000;i++) {
			
			s=s+"tpoint";
		}
		return s;
	}
	
	public static String stringBufferAppend() {
		
		StringBuffer s=new StringBuffer("hello");
		
		for(int i=0;i<10000;i++) {
			
			s.append("tpoint");
		}
		return s.toString();
	}

	public static String stringBuilderAppend() {
		
		StringBuilder sb=new StringBuilder("hello");
		
		for(int i=0;i<10000;i++) {
			
			sb.append("tpoint");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
	
	long t1=System.currentTimeMillis();
	stringAppend();
	System.out.println(System.currentTimeMillis()-t1 +" ms");
	
	long ta=System.currentTimeMillis();
	stringBufferAppend();
	System.out.println(System.currentTimeMillis()-ta +" ms");
	
	long t3=System.currentTimeMillis();
	stringBufferAppend();
	System.out.println(System.currentTimeMillis()-t3+" ms");
	}
}
