package assign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class login {

	private JFrame frame;
	private JTextField username;
	private JPasswordField psd;
    private  String possword;               //two attributes of role 
    private String name;
	/**
	 * Launch the application.
	 */
    public void setname(String user)       //setter function
    {
    	name=user;
    	
    }
    public void setpossword(String psd)
    {
    	possword=psd;
    	
    }
    public boolean check()         //check weather string or null or not 
    {
    	if(name==null && possword==null)
		return true;
    	else
    		return false;
    	
    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();       //main function 
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {      //inittilize the content of frame 
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("username ");
		lblUsername.setBounds(76, 101, 99, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Pwd");
		lblNewLabel.setBounds(76, 168, 59, 21);
		frame.getContentPane().add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(154, 98, 86, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {     //click listener function
			//when click on button login
			public void actionPerformed(ActionEvent arg0) {
				String uname=username.getText();
				String pwd=psd.getText();

				name=username.getText();
				possword=psd.getText();
				//check the userna and Possward 
				if(uname.equals("omani") && pwd.equals("omani123")) //check the validity of string of teacher
				{
					JOptionPane.showMessageDialog(frame,"You Successfully Login");
					titlepage second1=new titlepage();
					second1.setVisible(true);
				}
				else if(uname.equals("nathu") && pwd.equals("nathumal"))   //check the validity of string of student 
				{
					JOptionPane.showMessageDialog(frame,"You Successfully Login");
					Quiz2 second = null;
					try {
						second = new Quiz2();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					second.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Invalid Username and Possward ");  //invalid username and possword
				}
				
			}
		});
		btnLogin.setBounds(154, 227, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		psd = new JPasswordField();
		psd.setBounds(154, 168, 86, 20);
		frame.getContentPane().add(psd);
	}
}
