package pract;

class threadSleep extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i+1);
		}
	}
}
public class Multi {

	public static void main(String[] args) {
	
		threadSleep ts=new threadSleep();
		threadSleep ts2=new threadSleep();
		ts.start();
		ts2.run();
	}
}