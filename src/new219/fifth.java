package new219;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fifth extends JFrame {
	
	

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
					fifth frame = new fifth();
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
	
	public fifth() {
		
	
		 
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delivery");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(179, 10, 78, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your Car will be Delivered to:");
		lblNewLabel_1.setBounds(120, 42, 181, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(53, 65, 321, 22);
		contentPane.add(t1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter delivery Date:(d/m/y)");
		lblNewLabel_2.setBounds(10, 118, 172, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(192, 115, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pincode:");
		lblNewLabel_3.setBounds(10, 160, 57, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 157, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton bill = new JButton("Bill Details");
		bill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				sixth window= new sixth();
				window.setVisible(true);
			}
		});
		bill.setBounds(192, 232, 85, 21);
		contentPane.add(bill);
		
		}
		
	}
	
}
	

