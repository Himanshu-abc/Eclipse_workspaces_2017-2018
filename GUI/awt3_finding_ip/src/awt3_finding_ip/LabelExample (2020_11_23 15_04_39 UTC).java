package awt3_finding_ip;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelExample extends Frame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	TextField tf;  Label l; Button b;
	
	public LabelExample() {
		
		tf=new TextField();
		tf.setBounds(50, 50, 150, 20);
		l=new Label();
		l.setBounds(50, 100, 250, 20);
		b=new Button("find ip");
		b.setBounds(50, 150, 250, 20);
		b.addActionListener(this);
		add(b); add(l);  add(tf);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try{
			
			String host=tf.getText();
			String ip=java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP Address of  "+host+ "  is "+ip);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new LabelExample();
	}
}