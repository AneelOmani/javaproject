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

public class titlepage extends JFrame {

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
					titlepage frame = new titlepage();
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
	public titlepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title ");
		lblTitle.setBounds(44, 56, 61, 14);
		contentPane.add(lblTitle);
		
		textField = new JTextField();
		textField.setBounds(102, 53, 266, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(44, 128, 61, 20);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 128, 296, 48);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCreateQuiz = new JButton("Create Quiz");
		btnCreateQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String  title=textField.getText();
				String description=textField_1.getText();
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
							os.writeObject(title);
							os.writeObject(description);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						select second1=new select();
						second1.setVisible(true);
			}
		});
		btnCreateQuiz.setBounds(162, 199, 145, 20);
		contentPane.add(btnCreateQuiz);
	}
}
