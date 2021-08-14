package spring_5;

public class Car {
	
	private String Model;
	private String color;
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showCarProperties() {
		System.out.println(Model);
		System.out.println(color);
	}
}