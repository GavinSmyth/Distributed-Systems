package net.codeJava.swing;

import java.awt.BorderLayout;
import java. sql. Statement;
import java.awt.EventQueue;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class login1 extends JFrame {

	private JPanel contentPane;
	private JTextField loginuser;
	private JPasswordField loginpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 frame = new login1();
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
	public login1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 405, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 28, 171, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\loginicon.jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 200, 264, 241);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(404, 0, 404, 441);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSmartHotel = new JLabel("Smart Hotel");
		lblSmartHotel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblSmartHotel.setForeground(new Color(255, 255, 255));
		lblSmartHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmartHotel.setBounds(104, 37, 171, 34);
		panel_1.add(lblSmartHotel);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(49, 134, 135, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(49, 189, 135, 21);
		panel_1.add(lblNewLabel_2_1);
		
		loginuser = new JTextField();
		loginuser.setBounds(189, 134, 165, 21);
		panel_1.add(loginuser);
		loginuser.setColumns(10);
		
		loginpassword = new JPasswordField();
		loginpassword.setBounds(189, 189, 165, 26);
		panel_1.add(loginpassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection connection;
				ResultSet rsResultset;
				String nameString  = loginuser.getText();
				String passwordString = String.valueOf(loginpassword.getPassword());
				String queryString = "SELECT * FROM `the_app_users` WHERE `name` =? AND `password` =?";
				try {
					connection = DriverManager.getConnection("jdbc:mysql://localhost/java_login", "root", "");
					
					
					PreparedStatement stmt = connection.prepareStatement(queryString);
					stmt.setString(1, nameString);
					stmt.setString(2, passwordString);

					rsResultset = stmt.executeQuery();
					
					if(rsResultset.next()) {
						smartHotelUI smart = new smartHotelUI();
						smart.setVisible(true);
						smart.pack();
						smart.setLocationRelativeTo(null);
						smart.setExtendedState(JFrame.MAXIMIZED_BOTH);
						contentPane.setVisible(false);
						
					}else {
						JOptionPane.showMessageDialog(null, "Incorrect username or password");

					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setBounds(69, 304, 112, 26);
		panel_1.add(btnNewButton);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register reg = new register();
				reg.setVisible(true);
				contentPane.setVisible(false);
				
			}
		});
		btnSignup.setBounds(228, 304, 112, 26);
		panel_1.add(btnSignup);
	}

}
