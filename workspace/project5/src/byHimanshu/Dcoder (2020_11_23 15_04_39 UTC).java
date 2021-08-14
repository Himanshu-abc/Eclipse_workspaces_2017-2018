package byHimanshu;

public class Dcoder {

	public static void main(String[] args)  {
	
		
			Table ta=new Table();
			
			B b=new B(ta);
			C c=new C(ta);
			
			b.start();
			c.start();
		
	}
}
class B extends Thread{
	
	Table t;
	B(Table t){
		this.t=t;
	}
	
	public void run() {
	t.printTable(5);	
	}
}
class C extends Thread{
	Table t;
	C(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
class Table{
	
	public void printTable(int a) {
		
			for(int i=1;i<=10;i++) {
				System.out.println(i*a);
				
				try {
					Thread.sleep(300);
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}