package assign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class select extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					select frame = new select();
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
	public select() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectOneOf = new JLabel("Select one of Below ");
		lblSelectOneOf.setBounds(99, 61, 221, 14);
		contentPane.add(lblSelectOneOf);
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.setSelectedIndex(-1);
		comboBox.setEditable(false);
		comboBox.setBounds(117, 97, 162, 20);
		contentPane.add(comboBox);
		comboBox.addItem("");
		comboBox.addItem("MCQS");
		comboBox.addItem("True and false");
		comboBox.addItem("Numerals");
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String select=(String) comboBox.getSelectedItem();
				if(select=="MCQS")
				{
					second second1=new second();
					second1.setVisible(true);
				}
				if(select=="True and false")
				{

					TrueFalse second1=new TrueFalse();
					second1.setVisible(true);
				}
				if(select=="Numerals")
				{

					Numeral second1=new Numeral();
					second1.setVisible(true);
				}
				
				
			}
		});
		
	}
}
