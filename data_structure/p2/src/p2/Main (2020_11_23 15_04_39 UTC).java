package p2;

public class Main {

	public static void main(String[] args) {
		
		Queuex qx=new Queuex();
		qx.enQueue(1);
		qx.enQueue(2);
		qx.enQueue(3);
		qx.enQueue(4);
		System.out.println("front "+qx.front());
		System.out.println("rear "+qx.rear());
		System.out.println(qx.deQueue());
		System.out.println(qx.deQueue());
		System.out.println("front "+qx.front());
		System.out.println("rear "+qx.rear());
		System.out.println(qx.deQueue());
		System.out.println(qx.deQueue());
		System.out.println("front "+qx.front());
		System.out.println("rear "+qx.rear());
		System.out.println(qx.deQueue());   // 5th line
		System.out.println(qx.deQueue());
		System.out.println(qx.deQueue());
	}
}
