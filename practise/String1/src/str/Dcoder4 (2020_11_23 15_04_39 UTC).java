package str;

import java.util.StringTokenizer;

public class Dcoder4 {

	public static void main(String[] args) {
		
	//reverse words of a string
		
	String s="reverse words of a String";
	String rev="";
	
	StringTokenizer st=new StringTokenizer(s," ");
	
	while(st.hasMoreTokens()) {
		rev=st.nextToken()+" "+rev;
	}
	
	System.out.println(rev);
	}
}
