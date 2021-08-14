
	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;

	class PassData extends JFrame
	{
	    JTextField text;
	    PassData(){
	        JLabel l=new JLabel("Name: ");
	        text=new JTextField(20);
	        JButton b=new JButton("Send");
	        setLayout(null);
	        l.setBounds(10,10,100,20);
	        text.setBounds(120,10,150,20);
	        b.setBounds(120,40,80,20);
	        add(l);
	        add(text);
	        add(b);
	        setVisible(true);
	        setSize(300,100);
	          b.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	            String value=text.getText();
	            NextPage page=new NextPage(value);
	            page.setVisible(true);
	            }
	        });
	    }
	        public static void main(String[] args) 
	    {
	        new PassData();
	    }
	}