package str;

public class Dcoder {
	
	public static StringBuilder reverseString(String s) {
		
		String rev="";
		String [] sa=s.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(String se:sa) {
			if(se!="") {
				StringBuilder sb2=new StringBuilder(se);
				rev=sb2.reverse().toString();
				sb.append(rev+" ");
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		
	String s="hello this is world of programmers";
	System.out.println(s+"\n");
	
	System.out.println("reverse of each word in string\n");
	System.out.println(reverseString(s));
	}
}
