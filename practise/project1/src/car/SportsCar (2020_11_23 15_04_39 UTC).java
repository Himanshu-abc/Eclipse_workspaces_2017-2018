package car;

public class SportsCar extends Car{
	// instance initialization block
	{
		System.out.println("this is sports car instance initialization block");
	}
	
	static {
		System.out.println("this is static sports car");	
	}
	
	public void overriding() {
		System.out.println("this is overrided function of sportsCar");
	}
	
	private boolean alarm;
	private boolean navigator;
	private boolean safeGuard;
	
	public boolean isAlarm() {
		return alarm;
	}
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	public boolean isNavigator() {
		return navigator;
	}
	public void setNavigator(boolean navigator) {
		this.navigator = navigator;
	}
	public boolean isSafeGuard() {
		return safeGuard;
	}
	public void setSafeGuard(boolean safeGuard) {
		this.safeGuard = safeGuard;
	}
	@Override
	public String toString() {
		return "SportsCar [alarm=" + alarm + ", navigator=" + navigator + ", safeGuard=" + safeGuard + ", toString()="
				+ super.toString() + "]";
	}	
}
