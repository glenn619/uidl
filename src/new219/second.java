package new219;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class second extends JFrame {

	private JPanel contentPane;
	private JTextField tn;
	private JTextField tnum;
	private JTextField textField_2;
	private JTextField tmail;
	private JTextField tad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second frame = new second();
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
	public second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car Sales Management ");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(80, 10, 296, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your Details:-");
		lblNewLabel_1.setBounds(158, 44, 120, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name:");
		lblNewLabel_2.setBounds(10, 80, 64, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number:");
		lblNewLabel_3.setBounds(10, 103, 64, 13);
		contentPane.add(lblNewLabel_3);
		
		tn = new JTextField();
		tn.setBounds(80, 77, 346, 19);
		contentPane.add(tn);
		tn.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age:");
		lblNewLabel_4.setBounds(10, 126, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		tnum = new JTextField();
		tnum.setBounds(80, 103, 183, 19);
		contentPane.add(tnum);
		tnum.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 126, 71, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setBounds(10, 155, 64, 13);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(80, 151, 59, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(158, 151, 76, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(236, 151, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Email:");
		lblNewLabel_6.setBounds(10, 181, 64, 13);
		contentPane.add(lblNewLabel_6);
		
		tmail = new JTextField();
		tmail.setBounds(80, 178, 346, 19);
		contentPane.add(tmail);
		tmail.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address:");
		lblNewLabel_7.setBounds(10, 210, 64, 13);
		contentPane.add(lblNewLabel_7);
		
		tad = new JTextField();
		tad.setBounds(80, 207, 346, 19);
		contentPane.add(tad);
		tad.setColumns(10);
		
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tn.getText();
				String num=tnum.getText();
				String mail=tmail.getText();
		        String add=tad.getText();
		        fifth ff = new fifth(add);
		        ff.setVisible(true);
		       
				third window= new third();
				window.setVisible(true);
			}
		});
		next.setBounds(178, 236, 85, 21);
		contentPane.add(next);
	}
}
