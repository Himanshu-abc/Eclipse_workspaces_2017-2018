package p2;

public class A {

	private int no;
	private String name;
	private X dataobj;
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public X getDataobj() {
		return dataobj;
	}
	public void setDataobj(X dataobj) {
		this.dataobj = dataobj;
	}

	@Override
	public String toString() {
		return "A [no=" + no + ", name=" + name + ", dataobj=" + dataobj + "]";
	}
	

}
