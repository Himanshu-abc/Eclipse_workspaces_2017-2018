package byHimanshu;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	public int compare(Student st1, Student st2) {
	if(st2.age>st1.age) {
		return -1;
	}
	else if(st2.age<st1.age) {
		return 1;
	}
	else
		return 0;
	}
}
