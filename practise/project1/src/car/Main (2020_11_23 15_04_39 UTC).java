package car;

public class Main {

	public static void main(String[] args) {
		
		SportsCar sc=new SportsCar();
		sc.setAlarm(true);
		sc.setCapacity(200);
		sc.setColor("red");
		sc.setEngine("hyper");
		sc.setFuelType("diesel");
		sc.setNavigator(true);
		sc.setPrice(700000000);
		sc.setSafeGuard(true);
		
		SportsCar sc2=new SportsCar();
		sc2.setAlarm(false);
		System.out.println(sc);
		
		sc2.overriding();
		String s="Hello world";
		while(s.contains(" ")) {
			System.out.println(s);
		}
	}
}
