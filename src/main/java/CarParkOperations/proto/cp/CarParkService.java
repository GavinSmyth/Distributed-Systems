package CarParkOperations.proto.cp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.util.Collection;

public class CarParkService extends carParkServiceGrpc.carParkServiceImplBase{
	private static final Logger logger = Logger.getLogger(CarParkService.class.getName());
	
	
	
	 private Server server;
	 
	 private void start() throws IOException {
		    /* The port on which the server should run */
		    int port = 3000;
		    
		    server = ServerBuilder.forPort(port)
		        .addService(new CarParkService())
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    
		    Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        System.err.println("*** shutting down gRPC server since JVM is shutting down");
		        CarParkService.this.stop();
		        System.err.println("*** server shut down");
		      }
		    });
		  }

		  private void stop() {
		    if (server != null) {
		      server.shutdown();
		    }
		  }

		  /**
		   * Await termination on the main thread since the grpc library uses daemon threads.
		   */
		  private void blockUntilShutdown() throws InterruptedException {
		    if (server != null) {
		      server.awaitTermination();
		    }
		  }

		  /**
		   * Main launches the server from the command line.
		   */
		  public static void main(String[] args) throws IOException, InterruptedException {
		    final CarParkService server = new CarParkService();
		    server.start();
		    server.blockUntilShutdown();
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
	
//	public void setFull(CarParkToUpdateRequest request, StreamObserver<carParkResponse> rStreamObserver) {
//			for(CarParkOperations.proto.cp.CarPark c : Car.getInstance()) {
//				if(c.getCarParkId() == request.getDeviceId()) {
//					carParkResponse response = carParkResponse.newBuilder().setCarPark(c).build();
//					for(CarParkOperations.proto.cp.CarPark car : Car.carparkCar) {
//						Car.carparkCar.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(c.getCarParkId()).setLocation(c.getLocation()).setStatus("Full").build());
//						rStreamObserver.onNext(response);
//						rStreamObserver.onCompleted();
//						
//					}
//				}
//			}
//	}
	
   
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
