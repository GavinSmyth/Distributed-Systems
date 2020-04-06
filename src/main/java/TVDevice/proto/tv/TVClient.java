package TVDevice.proto.tv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import HeatingDevice.proto.h.HeaterServiceGrpc;
import HeatingDevice.proto.h.HeaterStatusRequest;
import HeatingDevice.proto.h.HeaterStatusResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TVClient extends JFrame {

	private JPanel contentPane;
	private JTextField tvStatus;
	private JTextField tvOn;
	private JTextField tvOff;
	private JTextField tvExact;
	private JTextField exact;
	JTextArea statusArea = new JTextArea();
	JTextArea onArea = new JTextArea();
	JTextArea offArea = new JTextArea();
	JTextArea exactArea = new JTextArea();
	private static final Logger logger = Logger.getLogger(TVClient.class.getName());
	private ManagedChannel channel = null;
	  private  TVServiceGrpc.TVServiceBlockingStub blockingStub;
	  private  TVServiceGrpc.TVServiceStub asyncStub;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TVClient() {
		 runClient();
	
	}
	public void runClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 644);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\tv.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(225, 0, 245, 190);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Status");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(52, 220, 103, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("On");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(219, 220, 103, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Off");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(418, 220, 103, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Exact Volume ");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(614, 220, 103, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		tvStatus = new JTextField();
		tvStatus.setBounds(69, 266, 86, 20);
		contentPane.add(tvStatus);
		tvStatus.setColumns(10);
		
		tvOn = new JTextField();
		tvOn.setBounds(236, 266, 86, 20);
		contentPane.add(tvOn);
		tvOn.setColumns(10);
		
		tvOff = new JTextField();
		tvOff.setBounds(423, 266, 86, 20);
		contentPane.add(tvOff);
		tvOff.setColumns(10);
		
		tvExact = new JTextField();
		tvExact.setBounds(581, 266, 86, 20);
		contentPane.add(tvExact);
		tvExact.setColumns(10);
		
		exact = new JTextField();
		exact.setBounds(704, 266, 86, 20);
		contentPane.add(exact);
		exact.setColumns(10);
		
		
		statusArea.setBounds(37, 318, 161, 137);
		contentPane.add(statusArea);
		
		
		onArea.setBounds(233, 318, 161, 137);
		contentPane.add(onArea);
		
		
		offArea.setBounds(423, 318, 161, 137);
		contentPane.add(offArea);
		
	
		exactArea.setBounds(607, 318, 161, 137);
		contentPane.add(exactArea);
		
		JButton statusBtn = new JButton("Status");
		statusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tvStatus.getText());
				showStatus(id);
			}
		});
		statusBtn.setBounds(69, 488, 89, 23);
		contentPane.add(statusBtn);
		
		JButton btnNewButton_1 = new JButton("On");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tvOn.getText());
				tVOn(id);
			}
		});
		btnNewButton_1.setBounds(262, 488, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Off");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tvOff.getText());
				tVOff(id);
			}
		});
		btnNewButton_2.setBounds(462, 488, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exact");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tvExact.getText());
				int exactV = Integer.parseInt(exact.getText());
				setExactVolume(id, exactV);
				
			}
		});
		btnNewButton_3.setBounds(635, 488, 89, 23);
		contentPane.add(btnNewButton_3);
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TVClient frame = new TVClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 public void shutdown() throws InterruptedException {
		    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	 }
	 
		public void showStatus(int id) {
			 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
				        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
				        // needing certificates.
				        .usePlaintext()
				        .build();
			  blockingStub = TVServiceGrpc.newBlockingStub(channel);
			    asyncStub = TVServiceGrpc.newStub(channel);
			    logger.info("Will try to get TV " + id + " ...");
			    TVStatusRequest request = TVStatusRequest.newBuilder().setTvId(id).build();
			    TVStatusResponse response;
			    try {
			    	response = blockingStub.showStatus(request);
			    	
			    }catch(StatusRuntimeException e) {
					 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				      return;
				 }
			    logger.info("Heater: " + response.getTv());
				statusArea.append(response.getTv().toString());
			
		}
		public void tVOn(int id) {
			 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
				        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
				        // needing certificates.
				        .usePlaintext()
				        .build();
			  blockingStub = TVServiceGrpc.newBlockingStub(channel);
			    asyncStub = TVServiceGrpc.newStub(channel);
			    logger.info("Will try to get TV " + id + " ...");
			    update_request request = update_request.newBuilder().setTvId(id).build();
			    TVDetailResponse response;
			    try {
			    	response = blockingStub.tVOn(request);
			    	
			    }catch(StatusRuntimeException e) {
					 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				      return;
				 }
			    logger.info("Heater: " + response.getTv());
			    onArea.append(response.getTv().toString());
			
		}
		public void tVOff(int id) {
			 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
				        
				        .usePlaintext()
				        .build();
			  blockingStub = TVServiceGrpc.newBlockingStub(channel);
			    asyncStub = TVServiceGrpc.newStub(channel);
			    logger.info("Will try to get TV " + id + " ...");
			    update_request request = update_request.newBuilder().setTvId(id).build();
			    TVDetailResponse response;
			    try {
			    	response = blockingStub.tVOff(request);
			    	
			    }catch(StatusRuntimeException e) {
					 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				      return;
				 }
			    logger.info("Heater: " + response.getTv());
			    offArea.append(response.getTv().toString());
			
		}
		public void setExactVolume(int id, int exact) {
			 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
				        
				        .usePlaintext()
				        .build();
			  blockingStub = TVServiceGrpc.newBlockingStub(channel);
			    asyncStub = TVServiceGrpc.newStub(channel);
			    logger.info("Will try to get TV " + id + " ...");
			    exact_update request = exact_update.newBuilder().setTvId(id).setExactRequest(exact).build();
			    TVDetailResponse response;
			    try {
			    	response = blockingStub.setExactVolume(request);
			    	
			    }catch(StatusRuntimeException e) {
					 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
				      return;
				 }
			    logger.info("Heater: " + response.getTv());
			    exactArea.append(response.getTv().toString());
			
		}
		
		

}
