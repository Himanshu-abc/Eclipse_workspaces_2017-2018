package str;

public class Dcoder5 implements Cloneable{  
int rollno;  
String name;  
  
Dcoder5(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  

	public static void main(String[] args) {
	
		try{  
			 Dcoder5 s1=new  Dcoder5(101,"amit");  
			  
			 Dcoder5 s2=(Dcoder5)s1.clone();  
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
			  
			}catch(CloneNotSupportedException c){}  
	}  
	}