package example;

public class ExampleBean {
	
	private int years;
	private String ultimateAnswer;
	
	public ExampleBean(int years, String ultimateAnswer) {
		super();
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}
	
	public void show() {
		System.out.println(years);
		System.out.println(ultimateAnswer);
	}
	
}
