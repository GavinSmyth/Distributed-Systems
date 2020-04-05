package LightsDevice.proto.li;

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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lightClient extends JFrame {
	private static final Logger logger = Logger.getLogger(lightClient.class.getName());
	private ManagedChannel channel = null;
	  private  LightsServiceGrpc.LightsServiceBlockingStub blockingStub;
	  private  LightsServiceGrpc.LightsServiceStub asyncStub;

	private JPanel contentPane;
	private JTextField lightStatus;
	private JTextField lightOff;
	private JTextField turnOn;
	JTextArea statusArea = new JTextArea();
	JTextArea offArea = new JTextArea();
	JTextArea OnArea = new JTextArea();

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public lightClient() {
		runClient();
		
	}
	
	
	public void runClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 617);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\lights.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(219, 11, 281, 214);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Light Status");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(72, 283, 127, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Turn Off");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(296, 283, 127, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Turn On");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(524, 283, 127, 22);
		contentPane.add(lblNewLabel_1_2);
		
		lightStatus = new JTextField();
		lightStatus.setBounds(82, 316, 86, 20);
		contentPane.add(lightStatus);
		lightStatus.setColumns(10);
		
		lightOff = new JTextField();
		lightOff.setBounds(306, 316, 86, 20);
		contentPane.add(lightOff);
		lightOff.setColumns(10);
		
		turnOn = new JTextField();
		turnOn.setBounds(545, 316, 86, 20);
		contentPane.add(turnOn);
		turnOn.setColumns(10);
		
		
		statusArea.setBounds(54, 362, 156, 109);
		contentPane.add(statusArea);
		
		offArea.setBounds(267, 362, 156, 109);
		contentPane.add(offArea);
		
		
		OnArea.setBounds(524, 362, 156, 109);
		contentPane.add(OnArea);
		
		JButton btnNewButton = new JButton("Status");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(lightStatus.getText());
				
				showStatus(id);
			}
		});
		btnNewButton.setBounds(79, 499, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("off");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(lightOff.getText());
				lightsOff(id);
			}
		});
		btnNewButton_1.setBounds(303, 499, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("On");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(turnOn.getText());
				lightsOn(id);
			}
		});
		btnNewButton_2.setBounds(545, 499, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lightClient frame = new lightClient();
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
		 channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = LightsServiceGrpc.newBlockingStub(channel);
		    asyncStub = LightsServiceGrpc.newStub(channel);
		    logger.info("Will try to get Lights " + id + " ...");
		    light_status_request request = light_status_request.newBuilder().setLightId(id).build();
		    lightStatusResponse response;
		    try {
		    	response = blockingStub.showStatus(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
		    logger.info("Heater: " + response.getLights());
			statusArea.append(response.getLights().toString());
		
	}
	public void lightsOn(int id) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = LightsServiceGrpc.newBlockingStub(channel);
		    asyncStub = LightsServiceGrpc.newStub(channel);
		    logger.info("Will try to get Lights " + id + " ...");
		    lightToUpdateRequest request = lightToUpdateRequest.newBuilder().setLightId(id).build();
		    lightDetailResponse response;
		    try {
		    	response = blockingStub.lightsOn(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
		    logger.info("Heater: " + response.getLights());
		    OnArea.append(response.getLights().toString());
	}
	public void lightsOff(int id) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = LightsServiceGrpc.newBlockingStub(channel);
		    asyncStub = LightsServiceGrpc.newStub(channel);
		    logger.info("Will try to get Lights " + id + " ...");
		    lightToUpdateRequest request = lightToUpdateRequest.newBuilder().setLightId(id).build();
		    lightDetailResponse response;
		    try {
		    	response = blockingStub.lightsOff(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
		    logger.info("Heater: " + response.getLights());
		    offArea.append(response.getLights().toString());
	}

}
