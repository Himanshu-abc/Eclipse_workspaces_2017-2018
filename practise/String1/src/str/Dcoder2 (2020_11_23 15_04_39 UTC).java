package str;

public class Dcoder2 {

	public static void main(String[] args) {
		
		//count no. of words in a string
		
		String s="Hello this is world of programmers";
		s=s.toUpperCase();
		char ch0='a';
		boolean flag=false;
		
		for(char ch='A';ch<='Z';ch++) {
			int count=0;
			
			flag=false;
			
			for(int i=0;i<s.length();i++) {
				
				if(ch==s.charAt(i)) {
					flag=true;
					ch0=ch;
					count++;
				}
			}
			if(flag==true) {
			System.out.println(ch0+" no. of times occured "+count);
			}
		}
		
	}
}
