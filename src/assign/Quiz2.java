package assign;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;

public class Quiz2 extends JFrame {

	private JPanel contentPane;
	private JTextField question;
	private String Quest;
	private String option1;
	private String option2;           //atttributes 
	private String option3;
	private String option4;
	
	 public void setQuest(String q)
	    {
	    	Quest=q;          //setter function
	    	
	    }
	    public void setoptionA(String A)
	    {
	    	option1=A;
	    	
	    }
	    public boolean check()           //check the validity of string 
	    {
	    	if(Quest==null && option1==null && option2==null && option3==null && option4==null)
			return true;
	    	else
	    		return false;
	    	
	    }
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {                         //main function inittiliazation of frame
					Quiz2 frame = new Quiz2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Quiz2() throws IOException {            //default constructor 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question ");
		lblQuestion.setBounds(29, 50, 46, 14);
		contentPane.add(lblQuestion);
		
		question = new JTextField();
		question.setBounds(96, 47, 309, 35);
		contentPane.add(question);
		question.setColumns(10);
		
		JRadioButton optionA = new JRadioButton("New radio button");
		optionA.setBounds(6, 118, 109, 23);
		contentPane.add(optionA);
		
		JRadioButton optionB = new JRadioButton("New radio button");
		optionB.setBounds(181, 118, 109, 23);
		contentPane.add(optionB);
		
		JRadioButton optionC = new JRadioButton("New radio button");
		optionC.setBounds(6, 169, 109, 23);
		contentPane.add(optionC);
		
		JRadioButton optionD = new JRadioButton("New radio button");
		optionD.setBounds(181, 169, 109, 23);
		contentPane.add(optionD);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(158, 216, 89, 23);
		contentPane.add(btnNext);
		FileInputStream fstream = new FileInputStream("Hello1.txt");     //file open
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;
		String names[] = new String[5];  //string of 5 charactors 
		//Read File Line By Line
		for(int i=0;(strLine = br.readLine()) != null && i<5;i++)   {
		  // Print the content on the console
			names[i]=strLine;
		}
		Quest=names[0];
		option1=names[1];
		option2=names[2];
		option3=names[3];      //assignment of strings aaaaaaaaasdd
		option4=names[4];
      question.setText(names[0]);
      optionA.setText(names[1]);
      optionB.setText(names[2]);//
      optionC.setText(names[3]);
      optionD.setText(names[4]);
		btnNext.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				Quiz2 quiz = null;
				try {
					quiz = new Quiz2();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				quiz.setVisible(true);		
			}
		});
	}
}
