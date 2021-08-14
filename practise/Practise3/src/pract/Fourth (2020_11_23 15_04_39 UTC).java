package pract;

class Table{
	{
		System.out.println("hello this is himanshu patidar and you are coding in java");
	}
	
	public void printTable(int n) {
		
		synchronized (Table.class) {
		
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
}

class MyThread1 extends Thread{
	
	Table t;
    MyThread1(Table t) {
		this.t=t;
	}
    public void run() {
    	t.printTable(5);
    }
}

class MyThread2 extends Thread{
	
	Table t;
	public MyThread2(Table t) {
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class Fourth {

	public static void main(String[] args) {
	
		Table t=new Table();
		Table t0=new Table();
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t0);
		
		t1.start();
		t2.start();

	}
}