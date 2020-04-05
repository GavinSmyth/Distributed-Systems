package LightsDevice.proto.li;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import HeatingDevice.proto.h.Heat;
import HeatingDevice.proto.h.HeaterDetailResponse;
import HeatingDevice.proto.h.HeaterStatusRequest;
import HeatingDevice.proto.h.HeaterStatusResponse;
import HeatingDevice.proto.h.HeaterUpdateRequest;
import LightsDevice.proto.li.LightsServiceGrpc.LightsServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class LightsServer extends LightsServiceImplBase{
	private static final Logger logger = Logger.getLogger(LightsServer.class.getName());

	 private Server server;
	 
	 private void start() throws IOException {
		    /* The port on which the server should run */
		    int port = 3000;
		    
		    server = ServerBuilder.forPort(port)
		        .addService(new LightsServer())
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    
		    Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        System.err.println("*** shutting down gRPC server since JVM is shutting down");
		        LightsServer.this.stop();
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
		    final LightsServer server = new LightsServer();
		    server.start();
		    server.blockUntilShutdown();
		  }	
		  
		  public void showStatus(light_status_request request, StreamObserver<lightStatusResponse> rStreamObserver) {
				for(LightsDevice.proto.li.Lights light : Light.getInstance()) {
					if(light.getLightId() == request.getLightId()) {
						lightStatusResponse response = lightStatusResponse.newBuilder().setLights(light).build();
						rStreamObserver.onNext(response);
						rStreamObserver.onCompleted();
						return;
					}
				}
			}
		  public void lightsOn(lightToUpdateRequest request, StreamObserver<lightDetailResponse> rStreamObserver) {
		    	ArrayList<LightsDevice.proto.li.Lights> lightsList = Light.getInstance();
		        for(int i=0; i<lightsList.size(); i++) {
		        		if(lightsList.get(i).getLightId() == request.getLightId()) {	
		        			LightsDevice.proto.li.Lights light_rec = (LightsDevice.proto.li.Lights) lightsList.get(i);
		        			Light.lights.clear();
		        			Light.lights.add(LightsDevice.proto.li.Lights.newBuilder().setLightId(light_rec.getLightId()).setLightLocation(light_rec.getLightLocation()).setLightStatus("On").build());
		        		}
		        }
		        for(LightsDevice.proto.li.Lights light : Light.lights) {
		        	lightDetailResponse response = lightDetailResponse.newBuilder().setLights(light).build();
		        	rStreamObserver.onNext(response);
		        	rStreamObserver.onCompleted();
		            return;
		        }
		    }
		  public void lightsOff(lightToUpdateRequest request, StreamObserver<lightDetailResponse> rStreamObserver) {
		    	ArrayList<LightsDevice.proto.li.Lights> lightsList = Light.getInstance();
		        for(int i=0; i<lightsList.size(); i++) {
		        		if(lightsList.get(i).getLightId() == request.getLightId()) {	
		        			LightsDevice.proto.li.Lights light_rec = (LightsDevice.proto.li.Lights) lightsList.get(i);
		        			Light.lights.clear();
		        			Light.lights.add(LightsDevice.proto.li.Lights.newBuilder().setLightId(light_rec.getLightId()).setLightLocation(light_rec.getLightLocation()).setLightStatus("OFF").build());
		        		}
		        }
		        for(LightsDevice.proto.li.Lights light : Light.lights) {
		        	lightDetailResponse response = lightDetailResponse.newBuilder().setLights(light).build();
		        	rStreamObserver.onNext(response);
		        	rStreamObserver.onCompleted();
		            return;
		        }
		    }

}
