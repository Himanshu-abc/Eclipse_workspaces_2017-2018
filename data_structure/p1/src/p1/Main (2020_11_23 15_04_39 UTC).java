package p1;

public class Main {

	public static void main(String[] args) {

		Stackx sx=new Stackx();
		System.out.println(sx.getClass());
		sx.push(1);
		sx.push(2);
		sx.push(3);
		
		System.out.println("-----------------------");
		
		System.out.println(sx.pop());
		System.out.println("size "+sx.stackSize());
		System.out.println("top "+sx.top());
		System.out.println(sx.pop());
		System.out.println(sx.pop());
		System.out.println(sx.pop());
		System.out.println(sx.pop());
		System.out.println(sx.pop());
		
	}
}
