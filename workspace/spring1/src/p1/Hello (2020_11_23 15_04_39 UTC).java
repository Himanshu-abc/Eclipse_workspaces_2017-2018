package p1;

public class Hello implements Message {
	
	private String msg;
	

	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public void showMessage() {
		System.out.println(msg);
	}

}
