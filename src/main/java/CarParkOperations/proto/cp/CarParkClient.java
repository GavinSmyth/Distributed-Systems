package CarParkOperations.proto.cp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import CarParkOperations.proto.cp.carParkServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.sound.midi.MidiDevice.Info;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.server.LogStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

import com.google.common.annotations.VisibleForTesting;
import com.google.protobuf.Message;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;


public class CarParkClient extends JFrame {
	private static final Logger logger = Logger.getLogger(CarParkClient.class.getName());

	  private ManagedChannel channel = null;
	  private carParkServiceGrpc.carParkServiceBlockingStub blockingStub;
	  private carParkServiceGrpc.carParkServiceStub asyncStub;
	  JTextArea statusArea = new JTextArea();
	  JTextArea fullArea = new JTextArea();
	  JTextArea spacesArea = new JTextArea();
	  JTextArea allCarsArea = new JTextArea();
	  private TestHelper testHelper;
	
	  

	private JPanel contentPane;
	private JTextField carParkStatus;
	private JTextField carParkFull;
	private JTextField carParkSpaces;
	private JTextField status;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public CarParkClient() {
		runclient();
		
	}
	  private void info(String msg, Object... params) {
		    logger.log(Level.INFO, msg, params);
		  }

		  private void warning(String msg, Object... params) {
		    logger.log(Level.WARNING, msg, params);
		  }
	public void runclient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 935);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gavin\\OneDrive\\Desktop\\carpark.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(197, 27, 333, 160);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CarPark Status");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(242, 11, 231, 38);
		contentPane.add(lblNewLabel_1);
		
		carParkStatus = new JTextField();
		carParkStatus.setBounds(288, 198, 130, 20);
		contentPane.add(carParkStatus);
		carParkStatus.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter ID bellow to view status");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(252, 180, 221, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter ID to set CarPark full");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(2, 59, 185, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Enter ID to set CarPark spaces");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(559, 59, 202, 17);
		contentPane.add(lblNewLabel_3_1);
		
		carParkFull = new JTextField();
		carParkFull.setBounds(34, 87, 102, 20);
		contentPane.add(carParkFull);
		carParkFull.setColumns(10);
		
		carParkSpaces = new JTextField();
		carParkSpaces.setBounds(614, 87, 102, 20);
		contentPane.add(carParkSpaces);
		carParkSpaces.setColumns(10);
		
		
		fullArea.setBounds(10, 118, 163, 84);
		contentPane.add(fullArea);
		
		
		spacesArea.setBounds(588, 118, 163, 84);
		contentPane.add(spacesArea);
		
		
		statusArea.setBounds(274, 229, 163, 84);
		contentPane.add(statusArea);
		
		JButton btnNewButton = new JButton("Full");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(carParkFull.getText());
				setFull(id);
				
			}
		});
		btnNewButton.setBounds(47, 223, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Status");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(carParkStatus.getText());
				showStatus(id);
			}
		});
		btnNewButton_1.setBounds(309, 324, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Spaces");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(carParkSpaces.getText());
				setSpaces(id);
			}
		});
		btnNewButton_2.setBounds(627, 213, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		allCarsArea.setBounds(94, 352, 547, 370);
		contentPane.add(allCarsArea);
		
		JButton allCars = new JButton("List all");
		allCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String statuString = status.getText();
				allCarParks(statuString);
			}
		});
		allCars.setBounds(324, 758, 89, 23);
		contentPane.add(allCars);
		
		status = new JTextField();
		status.setBounds(324, 727, 86, 20);
		contentPane.add(status);
		status.setColumns(10);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarParkClient frame = new CarParkClient();
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
		  blockingStub = carParkServiceGrpc.newBlockingStub(channel);
		    asyncStub = carParkServiceGrpc.newStub(channel);
			 logger.info("Will try to get CarPark " + id + " ...");
			 carparkRequest request = carparkRequest.newBuilder().setCarParkId(id).build();
			 carParkResponse response;
			 try {
				 response = blockingStub.showStatus(request);
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
				channel.shutdown();
			}
			 logger.info("Carpark: " + response.getCarPark());
			statusArea.append(response.getCarPark().toString());
	 }
	 
	 
	 
	 
	 
	 public void setFull(int id) {
		  channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = carParkServiceGrpc.newBlockingStub(channel);
		  asyncStub = carParkServiceGrpc.newStub(channel);
			 logger.info("Will try to get CarPark " + id + " ...");
			 CarParkToUpdateRequest request = CarParkToUpdateRequest.newBuilder().setDeviceId(id).build();
			 carParkResponse response;
			 try {
				 response = blockingStub.setFull(request);
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
				channel.shutdown();
			 }
			 logger.info("Carpark: " + response.getCarPark());
			 fullArea.append(response.getCarPark().toString());
	 }
	 
	 
	 
	 
	
	 public void allCarParks(String status) {
		 channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  	blockingStub = carParkServiceGrpc.newBlockingStub(channel);
		    asyncStub = carParkServiceGrpc.newStub(channel);
			 logger.info("Will try to get CarPark " + status + " ...");
			 
			 

			 allCarp request =
					 allCarp.newBuilder().setStatus(status).build();
		    Iterator<carParkResponse> carResponse;
		    try {
		    	carResponse = blockingStub.allCarParks(request);
		      for (int i = 1; carResponse.hasNext(); i++) {
		    	  carParkResponse carResponse1 = carResponse.next();
		    	  info("Result #" + i + ": {0}", carResponse1);
		        if (testHelper != null) {
		          testHelper.onMessage(carResponse1);
		        }
		      }
		    } catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
		    }
		  }
	 public void setSpaces(int id) {
		  channel =ManagedChannelBuilder.forAddress("localhost", 3000)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		  blockingStub = carParkServiceGrpc.newBlockingStub(channel);
		    asyncStub = carParkServiceGrpc.newStub(channel);
			 logger.info("Will try to get CarPark " + id + " ...");
			 CarParkToUpdateRequest request = CarParkToUpdateRequest.newBuilder().setDeviceId(id).build();
			 carParkResponse response;
			 try {
				 response = blockingStub.setSpaces(request);
			 }catch(StatusRuntimeException e) {
				 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			      return;
			 }finally {
					channel.shutdown();
				}
			 logger.info("Carpark: " + response.getCarPark());
			 spacesArea.append(response.getCarPark().toString());
	 }
	  @VisibleForTesting
	  interface TestHelper {
	    /**
	     * Used for verify/inspect message received from server.
	     */
	    void onMessage(Message message);

	    /**
	     * Used for verify/inspect error received from server.
	     */
	    void onRpcError(Throwable exception);
	  }

	  @VisibleForTesting
	  void setTestHelper(TestHelper testHelper) {
	    this.testHelper = testHelper;
	  }
	 
}
