package str;

import java.util.StringTokenizer;

public class Dcoder3 {

	public static void main(String[] args) {
	
		// count the no. of words in string
		
		String s="hello this is world of programmers";
		
		String sa[]=s.split(" ");
		System.out.println("no. of different words "+sa.length);
		
		StringTokenizer st=new StringTokenizer(s, " ");
		System.out.println(st.countTokens());
	}
}
