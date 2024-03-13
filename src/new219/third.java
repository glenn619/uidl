package new219;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class third extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton black;
	private JRadioButton blue;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	protected Object t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					third frame = new third();
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
	public third() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(154, 10, 111, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"M1(5,00,000)", "M2(8,00,000)", "M3(12,00,000)", "M4(15,00,000)", "M5(25,00,000)"}));
		cb.setBounds(177, 48, 154, 21);
		contentPane.add(cb);
		
		JLabel lblNewLabel_1 = new JLabel("Select yor BMW Model:");
		lblNewLabel_1.setBounds(10, 52, 144, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select your Car Colour:");
		lblNewLabel_2.setBounds(10, 98, 144, 13);
		contentPane.add(lblNewLabel_2);
		
		black = new JRadioButton("Black");
		buttonGroup.add(black);
		black.setBounds(162, 94, 103, 21);
		contentPane.add(black);
		
		JRadioButton red = new JRadioButton("Red");
		buttonGroup.add(red);
		red.setBounds(311, 94, 103, 21);
		contentPane.add(red);
		
		blue = new JRadioButton("Blue");
		buttonGroup.add(blue);
		blue.setBounds(162, 140, 103, 21);
		contentPane.add(blue);
		
		JRadioButton grey = new JRadioButton("Grey");
		buttonGroup.add(grey);
		grey.setBounds(311, 140, 103, 21);
		contentPane.add(grey);
		
		JLabel lblNewLabel_3 = new JLabel("Extra Features:(+40,000)");
		lblNewLabel_3.setBounds(10, 183, 144, 13);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton wd4 = new JRadioButton("4 Wheel Drive");
		buttonGroup_1.add(wd4);
		wd4.setBounds(162, 179, 131, 21);
		contentPane.add(wd4);
		
		JRadioButton cc = new JRadioButton("Cruise Control");
		buttonGroup_1.add(cc);
		cc.setBounds(311, 179, 119, 21);
		contentPane.add(cc);
		
		JRadioButton offr = new JRadioButton("Off Road Control");
		buttonGroup_1.add(offr);
		offr.setBounds(162, 213, 131, 21);
		contentPane.add(offr);
		
		JRadioButton eco = new JRadioButton("Eco mode");
		buttonGroup_1.add(eco);
		eco.setBounds(311, 213, 119, 21);
		contentPane.add(eco);
		
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String model=(String) cb.getSelectedItem();
				String colour,extra;
				if(red.isSelected()) {
					colour="Red";
				}
				if(black.isSelected()) {
					colour="Black";
				}
				if(blue.isSelected()) {
					colour="Blue";
				}
				if(grey.isSelected()) {
					colour="Grey";
				}
				if(wd4.isSelected()) {
					extra="4 Wheel Drive";
				}
				if(cc.isSelected()) {
					extra="Criuse Control";
				}
				if(offr.isSelected()) {
					extra="Offroad Control";
				}
				if(eco.isSelected()) {
					extra="Eco Mode";
				}
				
				fourth window= new fourth();
				window.setVisible(true);
			}
		});
		next.setBounds(10, 232, 85, 21);
		contentPane.add(next);
	}
}
