package p2;

public class A {

	private int roll;
	private String name;
	private X dataObj;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public X getDataObj() {
		return dataObj;
	}
	public void setDataObj(X dataObj) {
		this.dataObj = dataObj;
	}
	
	public void show() {
		
		System.out.println(roll);
		System.out.println(name);
		System.out.println(dataObj.getMessage());
	}
}