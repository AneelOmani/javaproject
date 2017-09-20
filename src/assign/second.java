package assign;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class second extends JFrame {

	protected static final String Quest = null;
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField txtB;
	private JTextField textField_3;
	private JTextField textField_4;         
	private JTextField textField_5;
	private JLabel lblQuestion;
	private JTextField textField_6;

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
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(24, 114, 46, 14);
		contentPane.add(lblA);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 111, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(24, 139, 46, 14);
		contentPane.add(lblB);
		
		txtB = new JTextField();
		txtB.setBounds(103, 142, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(24, 174, 46, 14);
		contentPane.add(lblC);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 173, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblD = new JLabel("D");
		lblD.setBounds(24, 222, 46, 14);
		contentPane.add(lblD);
		
		textField_4 = new JTextField();
		textField_4.setBounds(103, 219, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCorrect = new JLabel("Correct");
		lblCorrect.setBounds(255, 139, 46, 14);
		contentPane.add(lblCorrect);
		
		textField_5 = new JTextField();
		textField_5.setBounds(313, 136, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Quest=textField_6.getText();
				String a=textField_2.getText();
				String b=txtB.getText();
				String c=textField_3.getText();
				String d=textField_4.getText();
				String correct=textField_5.getText();
				System.out.println(Quest);
				//store in the file of Hello1 
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
					os.writeObject(a);
					os.writeObject(b);
					os.writeObject(c);
					os.writeObject(d);
					os.writeObject(correct);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			  //  main(new String[] {"a","b","c"});
			  	select frame = new select();
				frame.setVisible(true);
			}
			
			
		});
		btnAdd.setBounds(293, 195, 89, 23);
		contentPane.add(btnAdd);
		
		lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(24, 73, 46, 14);
		contentPane.add(lblQuestion);
		
		textField_6 = new JTextField();
		textField_6.setBounds(88, 65, 228, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
