import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBanklogo = new JLabel("bank-logo");
		lblBanklogo.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\banking_application_images\\images (6).png"));
		lblBanklogo.setBounds(10, 11, 424, 105);
		frame.getContentPane().add(lblBanklogo);
		
		JLabel lblAccountno = new JLabel("Account_no.");
		lblAccountno.setBounds(58, 153, 85, 14);
		frame.getContentPane().add(lblAccountno);
	}
}
