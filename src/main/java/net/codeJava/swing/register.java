package net.codeJava.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class register extends JFrame {

	private JPanel contentPane;
	private JTextField registerUsername;
	private JPasswordField registerPassword;
	private JTextField registerUsername1;
	private JPasswordField registerPassword1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setForeground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 403, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\loginicon.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(64, 184, 266, 257);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Register");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(94, 31, 199, 38);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setForeground(new Color(0, 0, 128));
		panel_1.setBounds(402, 0, 406, 441);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Smart Hotel");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(115, 39, 199, 38);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(52, 139, 119, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(52, 176, 119, 26);
		panel_1.add(lblNewLabel_3);
		
		registerUsername1 = new JTextField();
		registerUsername1.setBounds(228, 144, 128, 20);
		panel_1.add(registerUsername1);
		registerUsername1.setColumns(10);
		
		JButton jButton_Register1 = new JButton("Register");
		jButton_Register1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = registerUsername1.getText();
				String password = String.valueOf(registerPassword1.getPassword());
				String msg = "" + name;
                msg += " \n";
				
				try {
					Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost/java_login", "root", "");
				    String query = "INSERT INTO `the_app_users`( `name`, `password`) VALUES (?, ?)";
				    PreparedStatement stmt = connection.prepareStatement(query);
				    stmt.setString(1, name);
				    stmt.setString(2, password);

				    //Statement statement = connection.createStatement();
				   int x = stmt.executeUpdate();
				    if(x == 0) {
				    	JOptionPane.showMessageDialog(jButton_Register1, "This alredy exist");
				    }else {
                        JOptionPane.showMessageDialog(jButton_Register1,
                                "Welcome, " + msg + "Your account is sucessfully created");
                        }
				    
				
				}catch (Exception e1) {
					// TODO: handle exception
					
					System.out.println("cannot connect");
			        e1.printStackTrace();
				}
			
			}
			
		});
		
		
		jButton_Register1.setBounds(103, 280, 211, 26);
		panel_1.add(jButton_Register1);
		
		registerPassword1 = new JPasswordField();
		registerPassword1.setBounds(228, 181, 128, 21);
		panel_1.add(registerPassword1);
		
		JButton btnNewButton = new JButton("Already a user");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login1 log = new login1();
				log.setVisible(true);
				contentPane.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(103, 317, 211, 26);
		panel_1.add(btnNewButton);
		
		
	}

}
