package awt_example;

import java.awt.Button;
import java.awt.Frame;

public class First2 {
	
	public First2() {
		Frame f=new Frame();
		Button b=new Button("click me");
		b.setBounds(50, 100, 80, 50);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
	
		First2 f2=new First2();
	}
}
