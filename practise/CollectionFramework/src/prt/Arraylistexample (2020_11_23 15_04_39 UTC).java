package prt;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	private int id;
	private String name;
	private int rollno;
	
	public Student(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}
}

public class Arraylistexample {

	public static void main(String[] args) {
		
		Student s=new Student(1,"romesh",12);
		Student s2=new Student(2,"himesh",24);
		
		ArrayList<Student> als=new ArrayList<Student>();
		als.add(s);
		als.add(s2);
		
		Iterator<Student> it=als.iterator();
		
		while(it.hasNext()) {
			Student sq=it.next();
			System.out.println(sq.getId()+sq.getName()+sq.getRollno());
		}
	}
}