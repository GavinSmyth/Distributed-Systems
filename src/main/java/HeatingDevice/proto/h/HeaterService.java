package HeatingDevice.proto.h;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.checkerframework.checker.units.qual.h;



import HeatingDevice.proto.h.HeaterService;
import HeatingDevice.proto.h.HeaterDetailResponse;
import HeatingDevice.proto.h.HeaterStatusRequest;

import HeatingDevice.proto.h.HeaterServiceGrpc;


import HeatingDevice.proto.h.HeaterServiceGrpc.HeaterServiceImplBase;
import TVDevice.proto.tv.TVDetailResponse;
import TVDevice.proto.tv.exact_update;
import TVDevice.proto.tv.tvdata;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class HeaterService extends HeaterServiceImplBase{
	private static final Logger logger = Logger.getLogger(HeaterService.class.getName());
	
	
	
	 private Server server;
	 
	 private void start() throws IOException {
		    /* The port on which the server should run */
		    int port = 3000;
		    
		    server = ServerBuilder.forPort(port)
		        .addService(new HeaterService())
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    
		    Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        System.err.println("*** shutting down gRPC server since JVM is shutting down");
		        HeaterService.this.stop();
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
		    final HeaterService server = new HeaterService();
		    server.start();
		    server.blockUntilShutdown();
		  }	
		public void showStatus(HeaterStatusRequest request, StreamObserver<HeaterStatusResponse> rStreamObserver) {
			for(HeatingDevice.proto.h.Heater heater : Heat.getInstance()) {
				if(heater.getHeaterId() == request.getHeaterId()) {
					HeaterStatusResponse response = HeaterStatusResponse.newBuilder().setHeater(heater).build();
					rStreamObserver.onNext(response);
					rStreamObserver.onCompleted();
					return;
				}
			}
		}
		public void setTempatureHigh(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
	    	ArrayList<HeatingDevice.proto.h.Heater> heatList = Heat.getInstance();
	        for(int i=0; i<heatList.size(); i++) {
	        		if(heatList.get(i).getHeaterId() == request.getDeviceId()) {	
	        			HeatingDevice.proto.h.Heater heater_rec = (HeatingDevice.proto.h.Heater) heatList.get(i);
	        			Heat.heat.clear();
	        			Heat.heat.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice(heater_rec.getDevice()).setDeviceLocation(heater_rec.getDeviceLocation()).setStatus("High").setExactTemp(heater_rec.getExactTemp()).build());
	        		}
	        }
	        for(HeatingDevice.proto.h.Heater heater : Heat.heat) {
	        	HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
	        	rStreamObserver.onNext(response);
	        	rStreamObserver.onCompleted();
	            return;
	        }
	    }
		public void setTempaturelow(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
	    	ArrayList<HeatingDevice.proto.h.Heater> heatList = Heat.getInstance();
	        for(int i=0; i<heatList.size(); i++) {
	        		if(heatList.get(i).getHeaterId() == request.getDeviceId()) {	
	        			HeatingDevice.proto.h.Heater heater_rec = (HeatingDevice.proto.h.Heater) heatList.get(i);
	        			Heat.heat.clear();
	        			Heat.heat.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice(heater_rec.getDevice()).setDeviceLocation(heater_rec.getDeviceLocation()).setStatus("Low").setExactTemp(heater_rec.getExactTemp()).build());
	        		}
	        }
	        for(HeatingDevice.proto.h.Heater heater : Heat.heat) {
	        	HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
	        	rStreamObserver.onNext(response);
	        	rStreamObserver.onCompleted();
	            return;
	        }
	    }

		public void setOff(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
	    	ArrayList<HeatingDevice.proto.h.Heater> heatList = Heat.getInstance();
	        for(int i=0; i<heatList.size(); i++) {
	        		if(heatList.get(i).getHeaterId() == request.getDeviceId()) {	
	        			HeatingDevice.proto.h.Heater heater_rec = (HeatingDevice.proto.h.Heater) heatList.get(i);
	        			Heat.heat.clear();
	        			Heat.heat.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice("Off").setDeviceLocation(heater_rec.getDeviceLocation()).setStatus(heater_rec.getStatus()).setExactTemp(heater_rec.getExactTemp()).build());
	        		}
	        }
	        for(HeatingDevice.proto.h.Heater heater : Heat.heat) {
	        	HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
	        	rStreamObserver.onNext(response);
	        	rStreamObserver.onCompleted();
	            return;
	        }
	    }
		public void setOn(HeaterUpdateRequest request, StreamObserver<HeaterDetailResponse> rStreamObserver) {
	    	ArrayList<HeatingDevice.proto.h.Heater> heatList = Heat.getInstance();
	        for(int i=0; i<heatList.size(); i++) {
	        		if(heatList.get(i).getHeaterId() == request.getDeviceId()) {	
	        			HeatingDevice.proto.h.Heater heater_rec = (HeatingDevice.proto.h.Heater) heatList.get(i);
	        			Heat.heat.clear();
	        			Heat.heat.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice("On").setDeviceLocation(heater_rec.getDeviceLocation()).setStatus(heater_rec.getStatus()).setExactTemp(heater_rec.getExactTemp()).build());
	        		}
	        }
	        for(HeatingDevice.proto.h.Heater heater : Heat.heat) {
	        	HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
	        	rStreamObserver.onNext(response);
	        	rStreamObserver.onCompleted();
	            return;
	        }
	    }
		
		public void setExactTemp(exact_temp requestExact_update, StreamObserver<HeaterDetailResponse> rStreamObserver) {
	    	ArrayList<HeatingDevice.proto.h.Heater> heatList = Heat.getInstance();
	    	 for(int i=0; i<heatList.size(); i++) {
	    		 if(heatList.get(i).getHeaterId() == requestExact_update.getHeaterId()) {	
	    			 HeatingDevice.proto.h.Heater heater_rec = (HeatingDevice.proto.h.Heater) heatList.get(i);
	    			 Heat.heat.clear();
	    			 int exact = requestExact_update.getExactTemp();
	        			Heat.heat.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(heater_rec.getHeaterId()).setDevice(heater_rec.getDevice()).setDeviceLocation(heater_rec.getDeviceLocation()).setStatus(heater_rec.getStatus()).setExactTemp(exact).build());					

	    		 }
	    		 
	    		 
	    	 }
	    	 for(HeatingDevice.proto.h.Heater heater : Heat.heat) {
	    		 HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();
		        	rStreamObserver.onNext(response);
		        	rStreamObserver.onCompleted();
		            return;
		        }

			
		}

}
