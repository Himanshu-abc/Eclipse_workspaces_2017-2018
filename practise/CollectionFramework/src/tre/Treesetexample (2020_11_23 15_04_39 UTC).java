package tre;

import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private int roll;
	
	public Student(int id, String name, int roll) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + "]";
	}

	@Override
	public int compareTo(Student s) {
		if(id>s.id) {
			return 1;
		}
		else if (id<s.id) {
			return -1;
		}
		else {
		return 0;
		}
	}	
}

public class Treesetexample {

	public static void main(String[] args) {
	
		Student s=new Student(2, "himanshu", 24);
		Student s2=new Student(3, "jinnah", 28);
		Student s3=new Student(1,"abdul",6);
		
		TreeSet<Student> ts=new TreeSet<Student>();
		
		ts.add(s);
		ts.add(s2);
		ts.add(s3);
		
		Iterator<Student> it=ts.iterator();
		while(it.hasNext()) {
			Student st=it.next();
			System.out.println(st.getId()+" "+st.getName()+" "+st.getRoll());
		}
	}
}