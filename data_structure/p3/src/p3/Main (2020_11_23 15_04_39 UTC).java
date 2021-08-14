package p3;

public class Main {

	public static void main(String[] args) {

		Cqueue cx=new Cqueue();
		cx.enQueue(1);
		cx.enQueue(2);
		System.out.println(cx.deQueue());
		System.out.println(cx.deQueue());
		cx.enQueue(3);
		cx.enQueue(4);
		cx.enQueue(5);
		System.out.println(cx.deQueue());
		System.out.println(cx.deQueue());
		System.out.println(cx.deQueue());
		System.out.println(cx.deQueue());
		
	}
}
