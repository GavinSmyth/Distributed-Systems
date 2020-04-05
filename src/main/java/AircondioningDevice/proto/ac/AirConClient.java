package AircondioningDevice.proto.ac;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.google.common.annotations.VisibleForTesting;
import com.google.protobuf.Message;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.Random;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import io.grpc.stub.StreamObserver;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AirConClient extends JFrame {
	 private static final Logger logger = Logger.getLogger(AirConClient.class.getName());

	  private ManagedChannel channel = null;
	  private  Airconditioning_serviceGrpc.Airconditioning_serviceBlockingStub blockingStub;
	  private  Airconditioning_serviceGrpc.Airconditioning_serviceStub asyncStub;
	  private JPanel contentPane;
	  private JTextField statusAir;
	  private JTextField turnID;
	  private JTextField tempID;
	  private JTextField Tempnew;
	  JTextArea statusResponse = new JTextArea();
	  JTextArea OnOffResponse = new JTextArea();
	  JTextArea tempResponse = new JTextArea();
	  JTextArea OnArea = new JTextArea();
	  private JTextField onFeild;
	  
		
	  
	  /**
	   * @wbp.parser.constructor
	   */
	  public AirConClient() {
		  runclient();
		  
	  }
	  
	  /** Construct client for accessing HelloWorld server using the existing channel. */
	  
	  public void runclient() {
		   
		    
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 605, 584);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(100, 149, 237));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\ac.jpg"));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 562, 160);
			contentPane.add(lblNewLabel);
			
			statusAir = new JTextField();
			statusAir.setBounds(89, 196, 86, 20);
			contentPane.add(statusAir);
			statusAir.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Get AC Status");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(69, 171, 114, 14);
			contentPane.add(lblNewLabel_1);
			
			
			statusResponse.setBounds(56, 243, 157, 79);
			contentPane.add(statusResponse);
			
			JLabel lblNewLabel_1_1 = new JLabel("Turn Off");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(345, 172, 114, 14);
			contentPane.add(lblNewLabel_1_1);
			
			turnID = new JTextField();
			turnID.setBounds(331, 196, 139, 20);
			contentPane.add(turnID);
			turnID.setColumns(10);
			
			
			OnOffResponse.setBounds(334, 243, 157, 79);
			contentPane.add(OnOffResponse);
			
			JLabel lblNewLabel_1_2 = new JLabel("Set AC Temp");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(69, 367, 114, 14);
			contentPane.add(lblNewLabel_1_2);
			
			tempID = new JTextField();
			tempID.setBounds(10, 391, 86, 20);
			contentPane.add(tempID);
			tempID.setColumns(10);
			
			Tempnew = new JTextField();
			Tempnew.setColumns(10);
			Tempnew.setBounds(139, 391, 86, 20);
			contentPane.add(Tempnew);
			
			
			tempResponse.setBounds(35, 422, 157, 79);
			contentPane.add(tempResponse);
			
			JButton getStatus = new JButton("Get Status");
			getStatus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int id = Integer.parseInt(statusAir.getText());
					currentDetails(id);
					
				}
			});
			getStatus.setBounds(86, 333, 89, 23);
			contentPane.add(getStatus);
			
			JButton turnBtn = new JButton("Turn Off");
			turnBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 int id = Integer.parseInt(turnID.getText());
					 setOff(id);
				}
			});
			turnBtn.setBounds(345, 333, 125, 23);
			contentPane.add(turnBtn);
			
			JButton setTempBtn = new JButton("New Temp");
			setTempBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 int id = Integer.parseInt(tempID.getText());
					 int newTemp = Integer.parseInt(Tempnew.getText());
					setTemp(id, newTemp);
				}
			});
			setTempBtn.setBounds(60, 511, 89, 23);
			contentPane.add(setTempBtn);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Turn On");
			lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_1.setForeground(Color.WHITE);
			lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(356, 368, 114, 14);
			contentPane.add(lblNewLabel_1_2_1);
			
			onFeild = new JTextField();
			onFeild.setBounds(373, 393, 86, 20);
			contentPane.add(onFeild);
			onFeild.setColumns(10);
			
			
			OnArea.setBounds(331, 422, 157, 79);
			contentPane.add(OnArea);
			
			JButton btnTurnOff = new JButton("Turn On");
			btnTurnOff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int id = Integer.parseInt(onFeild.getText());
					setOn(id);
				}
			});
			btnTurnOff.setBounds(370, 511, 89, 23);
			contentPane.add(btnTurnOff);
			
		  }
	  public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AirConClient frame = new AirConClient();
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
	  
	  public void currentDetails(int id) {
		  channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = Airconditioning_serviceGrpc.newBlockingStub(channel);
		    asyncStub = Airconditioning_serviceGrpc.newStub(channel);
			 logger.info("Will try to get device " + id + " ...");
			 deviceIDRequest deviceid = deviceIDRequest.newBuilder().setDeviceId(id).build();
			 ACResponse response;
			 try {
				 response =blockingStub.currentDetails(deviceid);
				 
				 
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
			  logger.info("Device: " + response.getAirConditioning ());
			  statusResponse.append(response.getAirConditioning().toString());
			  
			  
			  
			
		 }
		 public void setTemp(int id, int newTemp) {
			  channel =ManagedChannelBuilder.forAddress("localhost", 3000)
				        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
				        // needing certificates.
				        .usePlaintext()
				        .build();
			  blockingStub = Airconditioning_serviceGrpc.newBlockingStub(channel);
			    asyncStub = Airconditioning_serviceGrpc.newStub(channel);
			 logger.info("Will try to get device " + id + " ...");
			 TempRequest  tempRequest = TempRequest.newBuilder().setDeviceId(id).setNewTemp(newTemp).build();
			 ACResponse response;
			 try {
				 response =blockingStub.setTemp(tempRequest);
				 
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
			  logger.info("Device: " + response.getAirConditioning());
			  tempResponse.append(response.getAirConditioning().toString());
		 }
		 public void setOff(int id) {
			  channel =ManagedChannelBuilder.forAddress("localhost", 3000)
				        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
				        // needing certificates.
				        .usePlaintext()
				        .build();
			  blockingStub = Airconditioning_serviceGrpc.newBlockingStub(channel);
			    asyncStub = Airconditioning_serviceGrpc.newStub(channel);
			 logger.info("Will try switch off device" + id + " ...");
			 deviceIDRequest deviceid = deviceIDRequest.newBuilder().setDeviceId(id).build();
			 ACResponse response;
			 try {
				 response =blockingStub.setOff(deviceid);
				 
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
			 logger.info("Device: " + response.getAirConditioning());
			 OnOffResponse.append(response.getAirConditioning().toString());
			 
		 }
		 public void setOn(int id) {
			  channel =ManagedChannelBuilder.forAddress("localhost", 3000)
				        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
				        // needing certificates.
				        .usePlaintext()
				        .build();
			  blockingStub = Airconditioning_serviceGrpc.newBlockingStub(channel);
			    asyncStub = Airconditioning_serviceGrpc.newStub(channel);
			 logger.info("Will try switch off device" + id + " ...");
			 deviceIDRequest deviceid = deviceIDRequest.newBuilder().setDeviceId(id).build();
			 ACResponse response;
			 try {
				 response =blockingStub.setOn(deviceid);
				 
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }
			 logger.info("Device: " + response.getAirConditioning());
			 OnArea.append(response.getAirConditioning().toString());

			 
		 }
}
