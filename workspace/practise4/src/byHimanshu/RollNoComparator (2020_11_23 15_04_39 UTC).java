package byHimanshu;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{
	
	public int compare(Student st1,Student st2) {
	
		if(st2.rollNo>st1.rollNo) {
			return -1;
		}
		else if(st2.rollNo<st1.rollNo) {
			return 1;
		}
		else
		return 0;
	}

}
