package CarParkOperations.proto.cp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.util.Collection;

public class CarParkService extends carParkServiceGrpc.carParkServiceImplBase{
	private static final Logger logger = Logger.getLogger(CarParkService.class.getName());
	
	
	
	 private static class SampleListener implements ServiceListener {
	       public void serviceAdded(ServiceEvent event) {
	           System.out.println( event.getInfo().getPort());

	       }


	       public void serviceRemoved(ServiceEvent event) {
	           System.out.println("resolved " +event.getInfo());
	       }


	       public void serviceResolved(ServiceEvent event) {
	           System.out.println("resolved: " + event.getInfo());
	         
	      try {
	    	  CarParkService carParkService = new CarParkService();
	     
	       int port = event.getInfo().getPort();
	       

	    // portNumber= 50055;
	       Server server = ServerBuilder.forPort(port)
	           .addService(carParkService)
	           .build()
	           .start();

	       logger.info("Lighting Server started, listening on " + port);
	     

	       server.awaitTermination();
	   
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	       public static void main(String[] args) throws IOException, InterruptedException {
				  try {
			           // Create a JmDNS instance
			           JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());


			           // Add a service listener
			           jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
			           System.out.println("Listening");
			           // Wait a bit
			           Thread.sleep(30000);
			       } catch (UnknownHostException e) {
			           System.out.println(e.getMessage());
			       } catch (IOException e) {
			           System.out.println(e.getMessage());
			       }
			   }
			  }	
	
	public void showStatus(carparkRequest request, StreamObserver<carParkResponse> rStreamObserver) {
		for(CarParkOperations.proto.cp.CarPark c : Car.getInstance()) {
			if(c.getCarParkId() == request.getCarParkId()) {
				carParkResponse response = carParkResponse.newBuilder().setCarPark(c).build();
				rStreamObserver.onNext(response);
				rStreamObserver.onCompleted();
				return;
			}
		}	
	}

   
    public void setFull(CarParkToUpdateRequest request, StreamObserver<carParkResponse> rStreamObserver) {
    	ArrayList<CarParkOperations.proto.cp.CarPark> carList = Car.getInstance();
        for(int i=0; i<carList.size(); i++) {
        		if(carList.get(i).getCarParkId() == request.getDeviceId()) {	
        			CarParkOperations.proto.cp.CarPark heater_rec = (CarParkOperations.proto.cp.CarPark) carList.get(i);
        			Car.carparkCar.clear();
        			Car.carparkCar.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(heater_rec.getCarParkId()).setLocation(heater_rec.getLocation()).setStatus("Full").build());
        		}
        }
        for(CarParkOperations.proto.cp.CarPark heater : Car.carparkCar) {
        	carParkResponse response = carParkResponse.newBuilder().setCarPark(heater).build();
        	rStreamObserver.onNext(response);
        	rStreamObserver.onCompleted();
            return;
        }
    }
  
    public void setSpaces(CarParkToUpdateRequest request, StreamObserver<carParkResponse> rStreamObserver) {
    	ArrayList<CarParkOperations.proto.cp.CarPark> carList = Car.getInstance();
        for(int i=0; i<carList.size(); i++) {
        	if(carList.get(i).getCarParkId() == request.getDeviceId()) {	
        		CarParkOperations.proto.cp.CarPark heater_rec = (CarParkOperations.proto.cp.CarPark) carList.get(i);
        		Car.carparkCar.clear();
        		Car.carparkCar.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(heater_rec.getCarParkId()).setLocation(heater_rec.getLocation()).setStatus("Spaces").build());
        	}
        }
        for(CarParkOperations.proto.cp.CarPark heater : Car.carparkCar) {
        	carParkResponse response = carParkResponse.newBuilder().setCarPark(heater).build();
        	rStreamObserver.onNext(response);
        	  rStreamObserver.onCompleted();
              return;
        }
    }
//	public void setSpaces(CarParkToUpdateRequest request, StreamObserver<carParkResponse> rStreamObserver) {
//		ArrayList<CarParkOperations.proto.cp.CarPark> carList = Car.getInstance();
//		try {
//		for(CarParkOperations.proto.cp.CarPark c : carList) {
//			if(c.getCarParkId() == request.getDeviceId()) {	
//				Car.carparkCar.clear();
//				Car.carparkCar.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(c.getCarParkId()).setLocation(c.getLocation()).setStatus("Spaces").build());
//				for(CarParkOperations.proto.cp.CarPark car : Car.carparkCar) {
//					carParkResponse response = carParkResponse.newBuilder().setCarPark(car).build();
//					rStreamObserver.onNext(response);
//					rStreamObserver.onCompleted();
//				
//				}
//			}
//		}	
//		}catch(StatusRuntimeException e) {
//			 logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
//		      return;
//		 }
//	}

    @Override
    public void allCarParks(allCarp rAllCarp, StreamObserver<carParkResponse> rStreamObserver) {
    	ArrayList<CarParkOperations.proto.cp.CarPark> carList = Car.getInstance();
    	try {
    		for (int i = 0; i <carList.size(); i++) {	
    		for (CarParkOperations.proto.cp.CarPark c : carList) {
    					if(c.getStatus() == rAllCarp.getStatus()) {
    						carParkResponse response = carParkResponse.newBuilder().setCarPark(c).build();
    						
    						rStreamObserver.onNext(response);
    		                Thread.sleep(1000L);
    		                rStreamObserver.onCompleted();
    		            	return;
    				}
    			
    			}
    	}
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}finally {
        	rStreamObserver.onCompleted();
        }
    	
    }
    
	
	

	
}
