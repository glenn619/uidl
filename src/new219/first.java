package new219;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class first {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first window = new first();
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
	public first() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 96, 74, 13);
		frame.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(94, 94, 332, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 163, 74, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		lblNewLabel_3.setFont(new Font("Zilla Slab Medium", Font.BOLD, 20));
		lblNewLabel_3.setBounds(185, 46, 75, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		pass = new JPasswordField();
		pass.setBounds(94, 161, 332, 19);
		frame.getContentPane().add(pass);
		
		JButton next = new JButton("Submit");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=t1.getText();
				String p=pass.getText();
				if(name.equals("nishimay")&& p.equals("1234")) {
					JOptionPane.showMessageDialog(null,"Login Succesfull!!!");
					second window= new second();
					window.setVisible(true);
				}
				
			}
		});
		next.setBounds(10, 232, 85, 21);
		frame.getContentPane().add(next);
		
		JButton clear = new JButton("Clear all");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t1.setText(null);
				pass.setText(null);
			}
		});
		clear.setBounds(341, 232, 85, 21);
		frame.getContentPane().add(clear);
		
		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setForeground(new Color(0, 191, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(138, 10, 19, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("M");
		lblNewLabel_1_1.setForeground(new Color(0, 51, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(208, 10, 19, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("W");
		lblNewLabel_1_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(272, 10, 19, 26);
		frame.getContentPane().add(lblNewLabel_1_2);
	}
}
