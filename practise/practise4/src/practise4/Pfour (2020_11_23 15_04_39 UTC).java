package practise4;

public class Pfour {

	public static void main(String[] args) {

		//print different characters in a string
		
		String s="hello world";
		s=s.toUpperCase();
		int count = 0,i=0;
		int flag=0;
		System.out.println("different characters used ");
		for(char ch='A';ch<='Z';ch++) {
		
			flag=0;
			for(i=0;i<s.length();i++) {
				
				if(ch==s.charAt(i)) {
					flag=1;
					count++;
					break;
				}
			}
			if(flag==1) {
				System.out.print(s.charAt(i)+" ");
			}
		}
		System.out.println("no. of different characters used "+count);
	}
}