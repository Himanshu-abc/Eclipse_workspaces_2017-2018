package tre;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Book{
	
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class Tremapexample {

	public static void main(String[] args) {
	
		Book b1=new Book(8,"thor", 69.99);
		Book b2=new Book(2, "hulk", 99.99);
		Book b3=new Book(5, "antman", 29.99);
	
		TreeMap<Integer, Book> tm=new TreeMap<Integer,Book>();
		
		tm.put(2, b1);
		tm.put(6, b3);
		tm.put(1, b3);
		
		for(Map.Entry<Integer ,Book> me:tm.entrySet()) {
			int key=me.getKey();
			Book k=me.getValue();
			
			System.out.println(key+" "+k.getId()+" "+k.getName()+" "+k.getPrice());
		}
	}
}
