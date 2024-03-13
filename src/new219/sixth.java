package new219;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class sixth extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sixth frame = new sixth();
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
	public sixth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bill");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(186, 10, 49, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Owner details:");
		lblNewLabel_1.setBounds(10, 50, 88, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txt1 = new JTextArea();
		txt1.setBounds(10, 73, 299, 72);
		contentPane.add(txt1);
		
		JLabel lblNewLabel_2 = new JLabel("Total Bill:");
		lblNewLabel_2.setBounds(10, 155, 62, 13);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txt2 = new JTextArea();
		txt2.setBounds(10, 175, 299, 64);
		contentPane.add(txt2);
	}

}
