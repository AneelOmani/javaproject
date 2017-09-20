package assign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class TrueFalse extends JFrame {

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
					TrueFalse frame = new TrueFalse();
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
	public TrueFalse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(29, 74, 46, 14);
		contentPane.add(lblQuestion);
		
		textField = new JTextField();
		textField.setBounds(104, 71, 283, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnTrue = new JRadioButton("True");
		rdbtnTrue.setBounds(28, 124, 109, 23);
		contentPane.add(rdbtnTrue);
		
		JRadioButton rdbtnFalse = new JRadioButton("False");
		rdbtnFalse.setBounds(29, 174, 109, 23);
		contentPane.add(rdbtnFalse);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Quest=textField.getText();
				String correct=textField_1.getText();
				 FileOutputStream fs = null;
					try {
						fs = new FileOutputStream("Hello.txt",true);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					      ObjectOutputStream os = null;
						try {
							os = new ObjectOutputStream(fs);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							os.writeObject(Quest);
							os.writeObject(correct);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						select frame = new select();
						frame.setVisible(true);
				
			}
		});
		btnNext.setBounds(185, 198, 89, 23);
		contentPane.add(btnNext);
		
		textField_1 = new JTextField();
		textField_1.setBounds(247, 125, 107, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCorrect = new JLabel("Correct");
		lblCorrect.setBounds(191, 128, 46, 14);
		contentPane.add(lblCorrect);
		
		JLabel lblTrueAndFalse = new JLabel("True And False");
		lblTrueAndFalse.setBounds(139, 28, 135, 14);
		contentPane.add(lblTrueAndFalse);
	}
}
