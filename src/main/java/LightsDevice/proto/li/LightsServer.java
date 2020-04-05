package LightsDevice.proto.li;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

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
			    	  LightsServer lightServer = new LightsServer();
			     
			       int port = event.getInfo().getPort();
			       

			    // portNumber= 50055;
			       Server server = ServerBuilder.forPort(port)
			           .addService(lightServer)
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

		  /**
		   * Await termination on the main thread since the grpc library uses daemon threads.
		   */
		

		  /**
		   * Main launches the server from the command line.
		   */
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
