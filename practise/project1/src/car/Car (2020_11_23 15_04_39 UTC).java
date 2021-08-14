package car;

public class Car {
	// instance initialization block
	{
		System.out.println("this is car instance intialization block");
	}
	
	static {
		System.out.println("this is static car");
	}
	
	public void overriding() {
		System.out.println("this is overrided function of car");
	}
	
	private int price;
	private String fuelType;
	private String engine;
	private String color;
	private int capacity;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", fuelType=" + fuelType + ", engine=" + engine + ", color=" + color
				+ ", capacity=" + capacity + "]";
	}
}