package awt2_event_handling;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class ActionEvent extends Frame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField tf;
	
	public ActionEvent() {
		
		//create components
		
		tf=new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b=new Button("click me");
		b.setBounds(100, 120, 80, 30);
		
		//register listener
		
		b.addActionListener(this); //passing current instance
		
		//add components and set size, layout and visibility
		
		add(b);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent arg0) {
		tf.setText("welcome");
		
	}
	
	public static void main(String[] args) {
	new ActionEvent();
	}
}