package assign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Numeral extends JFrame {

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
					Numeral frame = new Numeral();
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
	public Numeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(35, 72, 46, 14);
		contentPane.add(lblQuestion);
		
		textField = new JTextField();
		textField.setBounds(102, 69, 301, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(35, 150, 46, 14);
		contentPane.add(lblAnswer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 147, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
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
		btnNext.setBounds(168, 203, 89, 23);
		contentPane.add(btnNext);
	}

}
