package HeatingDevice.proto.h;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CarParkOperations.proto.cp.CarParkClient;
import CarParkOperations.proto.cp.carParkServiceGrpc;
import CarParkOperations.proto.cp.carparkRequest;
import HeatingDevice.proto.h.HeaterServiceGrpc.HeaterServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeaterClient extends JFrame {
	private static final Logger logger = Logger.getLogger(HeaterClient.class.getName());
	private ManagedChannel channel = null;
	  private  HeaterServiceGrpc.HeaterServiceBlockingStub blockingStub;
	  private  HeaterServiceGrpc.HeaterServiceStub asyncStub;
	private JPanel contentPane;
	private JTextField exactID;
	private JTextField newTemp;
	private JTextField status;
	private JTextField setHigh;
	private JTextField setLow;
	private JTextField setOff;
	private JTextField setOn;
	JButton setHighBtn = new JButton("New button");
	JTextArea statusArea = new JTextArea();
	JTextArea setHighArea = new JTextArea();
	JTextArea setLowArea = new JTextArea();
	JTextArea setOffArea = new JTextArea();
	JTextArea setOnArea = new JTextArea();
	JTextArea newTempArea = new JTextArea();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public HeaterClient() {
		runClient();
	}
	public void runClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\heater.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(289, 0, 261, 245);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Exact Temp");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(87, 46, 110, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Status");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(660, 50, 110, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Set High");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(58, 309, 110, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Set On");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(642, 309, 110, 23);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Set Off");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setBounds(418, 309, 110, 23);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Set Low");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setBounds(231, 309, 110, 23);
		contentPane.add(lblNewLabel_1_5);
		
		exactID = new JTextField();
		exactID.setBounds(21, 80, 86, 20);
		contentPane.add(exactID);
		exactID.setColumns(10);
		
		newTemp = new JTextField();
		newTemp.setBounds(138, 80, 86, 20);
		contentPane.add(newTemp);
		newTemp.setColumns(10);
		
		status = new JTextField();
		status.setColumns(10);
		status.setBounds(670, 80, 86, 20);
		contentPane.add(status);
		
		setHigh = new JTextField();
		setHigh.setColumns(10);
		setHigh.setBounds(69, 343, 86, 20);
		contentPane.add(setHigh);
		
		setLow = new JTextField();
		setLow.setColumns(10);
		setLow.setBounds(245, 343, 86, 20);
		contentPane.add(setLow);
		
		setOff = new JTextField();
		setOff.setColumns(10);
		setOff.setBounds(434, 343, 86, 20);
		contentPane.add(setOff);
		
		setOn = new JTextField();
		setOn.setColumns(10);
		setOn.setBounds(668, 343, 86, 20);
		contentPane.add(setOn);
		
		
		newTempArea.setBounds(44, 110, 150, 135);
		contentPane.add(newTempArea);
		
		
		setHighArea.setBounds(44, 387, 150, 135);
		contentPane.add(setHighArea);
		
		
		setLowArea.setBounds(215, 387, 150, 135);
		contentPane.add(setLowArea);
		
		
		setOffArea.setBounds(400, 387, 150, 135);
		contentPane.add(setOffArea);
		
		
		setOnArea.setBounds(631, 387, 150, 135);
		contentPane.add(setOnArea);
		
		
		statusArea.setBounds(642, 110, 150, 135);
		contentPane.add(statusArea);
		
		JButton newTempBtn = new JButton("New button");
		newTempBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(exactID.getText());
				int exact = Integer.parseInt(newTemp.getText());
				setExactTemp(id, exact);
			}
		});
		newTempBtn.setBounds(69, 256, 89, 23);
		contentPane.add(newTempBtn);
		setHighBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(setHigh.getText());
				setTempatureHigh(id);
				
			}
		});
		
		
		setHighBtn.setBounds(69, 531, 89, 23);
		contentPane.add(setHighBtn);
		
		JButton setLowBtn = new JButton("New button");
		setLowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(setLow.getText());
				setTempaturelow(id);
			}
		});
		setLowBtn.setBounds(245, 531, 89, 23);
		contentPane.add(setLowBtn);
		
		JButton setOffBtn = new JButton("New button");
		setOffBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(setOff.getText());
				setOff(id);
			}
		});
		setOffBtn.setBounds(418, 531, 89, 23);
		contentPane.add(setOffBtn);
		
		JButton setOnBtn = new JButton("New button");
		setOnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(setOn.getText());
				setOn(id);
			}
		});
		setOnBtn.setBounds(663, 533, 89, 23);
		contentPane.add(setOnBtn);
		
		JButton statusbtn = new JButton("New button");
		statusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(status.getText());
				showStatus(id);
			}
		});
		statusbtn.setBounds(681, 256, 89, 23);
		contentPane.add(statusbtn);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeaterClient frame = new HeaterClient();
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
		  blockingStub = HeaterServiceGrpc.newBlockingStub(channel);
		    asyncStub = HeaterServiceGrpc.newStub(channel);
		    logger.info("Will try to get Heater " + id + " ...");
		    HeaterStatusRequest request = HeaterStatusRequest.newBuilder().setHeaterId(id).build();
		    HeaterStatusResponse response;
		    try {
		    	response = blockingStub.showStatus(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
		    logger.info("Heater: " + response.getHeater());
			statusArea.append(response.getHeater().toString());
		
	}
	public void setTempatureHigh(int id) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = HeaterServiceGrpc.newBlockingStub(channel);
		    asyncStub = HeaterServiceGrpc.newStub(channel);
		    logger.info("Will try to get Heater " + id + " ...");
		    HeaterUpdateRequest request = HeaterUpdateRequest.newBuilder().setDeviceId(id).build();
		    HeaterDetailResponse response;
		    try {
		    	response = blockingStub.setTempatureHigh(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
				channel.shutdown();
			}
		    logger.info("Heater: " + response.getHeater());
			setHighArea.append(response.getHeater().toString());
		
	}
	public void setTempaturelow(int id) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = HeaterServiceGrpc.newBlockingStub(channel);
		    asyncStub = HeaterServiceGrpc.newStub(channel);
		    logger.info("Will try to get Heater " + id + " ...");
		    HeaterUpdateRequest request = HeaterUpdateRequest.newBuilder().setDeviceId(id).build();
		    HeaterDetailResponse response;
		    try {
		    	response = blockingStub.setTempaturelow(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
				channel.shutdown();
			}
		    logger.info("Heater: " + response.getHeater());
			setLowArea.append(response.getHeater().toString());
		
	}
	public void setOff(int id) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = HeaterServiceGrpc.newBlockingStub(channel);
		    asyncStub = HeaterServiceGrpc.newStub(channel);
		    logger.info("Will try to get Heater " + id + " ...");
		    HeaterUpdateRequest request = HeaterUpdateRequest.newBuilder().setDeviceId(id).build();
		    HeaterDetailResponse response;
		    try {
		    	response = blockingStub.setOff(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
				channel.shutdown();
			}
		    logger.info("Heater: " + response.getHeater());
			setOffArea.append(response.getHeater().toString());
		
	}
	public void setOn(int id) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 50055)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = HeaterServiceGrpc.newBlockingStub(channel);
		    asyncStub = HeaterServiceGrpc.newStub(channel);
		    logger.info("Will try to get Heater " + id + " ...");
		    HeaterUpdateRequest request = HeaterUpdateRequest.newBuilder().setDeviceId(id).build();
		    HeaterDetailResponse response;
		    try {
		    	response = blockingStub.setOn(request);
		    	
		    }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
				channel.shutdown();
			}
		    logger.info("Heater: " + response.getHeater());
			setOnArea.append(response.getHeater().toString());
		
	}
	public void setExactTemp(int id, int exact) {
		channel =ManagedChannelBuilder.forAddress("localhost", 50055)
		        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
		        // needing certificates.
		        .usePlaintext()
		        .build();
	  blockingStub = HeaterServiceGrpc.newBlockingStub(channel);
	    asyncStub = HeaterServiceGrpc.newStub(channel);
	    logger.info("Will try to get Heater " + id + " ...");
	    exact_temp eTemp = exact_temp.newBuilder().setHeaterId(id).setExactTemp(exact).build();
	    HeaterDetailResponse response;
	    try {
	    	response = blockingStub.setExactTemp(eTemp);
	    	
	    }catch(StatusRuntimeException e) {
			 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		      return;
		 }finally {
			channel.shutdown();
		}
	    logger.info("Heater: " + response.getHeater());
		newTempArea.append(response.getHeater().toString());
		
	}
	

}
