package pract;

class ThreadJoin extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(800);
				System.out.println(Thread.currentThread() +" "+ i+1);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Third {

	public static void main(String[] args) {
		
	ThreadJoin t1=new ThreadJoin();
	ThreadJoin t2=new ThreadJoin();
	ThreadJoin t3=new ThreadJoin();
	
	t1.setName("t1");
	t2.setName("t2");
	t3.setName("t3");
	
	t1.setPriority(1);
	t3.setPriority(8);
	
	t1.start();
	t2.start();
	t3.start();
	
	
	try {
		t1.join();
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
}