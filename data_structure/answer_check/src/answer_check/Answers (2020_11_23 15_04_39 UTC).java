package answer_check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Answers {

	public static void main(String[] args) {
		
		String s1="C:/Users/Dell/Desktop/hr_answers.txt";
        String s2="C:/Users/Dell/Desktop/my_answers.txt";
		
		File f1=new File(s1);
		File f2=new File(s2);
		
		int i=0,count=1;
		
		try {
			
			BufferedReader br1=new BufferedReader(new FileReader(f1));
			BufferedReader br2=new BufferedReader(new FileReader(f2));
			
			String hr;
			String my;
			
			while((hr = br1.readLine())!=null && (my = br2.readLine())!=null) {
				 
				 System.out.println(count++ + "  " +hr+" = "+my+" ");
				
				if(!hr.equalsIgnoreCase(my)) {
					System.out.println("error " +  ++i);
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
