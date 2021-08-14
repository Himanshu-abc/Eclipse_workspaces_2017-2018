import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Authentication extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentication frame = new Authentication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Authentication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\banking_application_images\\bank_logo.jpg"));
		lblNewLabel.setBounds(22, 11, 390, 118);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Account No.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 162, 154, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPin = new JLabel("PIN");
		lblPin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPin.setBounds(89, 195, 46, 14);
		contentPane.add(lblPin);
		
		textField = new JTextField();
		textField.setBounds(223, 162, 189, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(223, 194, 189, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(223, 227, 77, 23);
		contentPane.add(btnLogin);
		
		JButton btnNewAccount = new JButton("NewAccount");
		btnNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewAccount.setBounds(310, 227, 102, 21);
		contentPane.add(btnNewAccount);
		
		JLabel lblA = new JLabel("a");
		lblA.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\banking_application_images\\fgggfgqw.jpg"));
		lblA.setBounds(417, 152, 24, 30);
		contentPane.add(lblA);
		
		JLabel lblKey = new JLabel("key");
		lblKey.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\banking_application_images\\fgggfg.jpg"));
		lblKey.setBounds(414, 195, 40, 14);
		contentPane.add(lblKey);
	}
}
