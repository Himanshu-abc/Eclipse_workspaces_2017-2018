package pract;

public class SecondDotOne {

	static class SNested{
		
		public void eat() {
			System.out.println("eating");
		}
	}
	
	public static void main(String[] args) {
		
		SecondDotOne.SNested obj=new SecondDotOne.SNested();
		
		obj.eat();
	}
}
