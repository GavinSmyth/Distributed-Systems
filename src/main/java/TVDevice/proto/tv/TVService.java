package TVDevice.proto.tv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;


import TVDevice.proto.tv.TVServiceGrpc.TVServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TVService extends TVServiceImplBase{
	
	private static final Logger logger = Logger.getLogger(TVService.class.getName());
 private Server server;
	 
	 private void start() throws IOException {
		    /* The port on which the server should run */
		    int port = 3000;
		    
		    server = ServerBuilder.forPort(port)
		        .addService(new TVService())
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    
		    Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        System.err.println("*** shutting down gRPC server since JVM is shutting down");
		        TVService.this.stop();
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
		    final TVService server = new TVService();
		    server.start();
		    server.blockUntilShutdown();
		  }	
		  public void showStatus(TVStatusRequest request, StreamObserver<TVStatusResponse> rStreamObserver) {
				for(TVDevice.proto.tv.TV tele : tvdata.getInstance()) {
					if(tele.getTvId() == request.getTvId()) {
						TVStatusResponse response = TVStatusResponse.newBuilder().setTv(tele).build();
						rStreamObserver.onNext(response);
						rStreamObserver.onCompleted();
						return;
					}
				}
			}
		  
			public void tVOn(update_request request, StreamObserver<TVDetailResponse> rStreamObserver) {
		    	ArrayList<TVDevice.proto.tv.TV> tvList = tvdata.getInstance();
		        for(int i=0; i<tvList.size(); i++) {
		        		if(tvList.get(i).getTvId() == request.getTvId()) {	
		        			TVDevice.proto.tv.TV Tv_rec = (TVDevice.proto.tv.TV) tvList.get(i);
		        			tvdata.tvdata.clear();
		        			tvdata.tvdata.add(TVDevice.proto.tv.TV.newBuilder().setTvId(Tv_rec.getTvId()).setDeviceLocation(Tv_rec.getDeviceLocation()).setStatus("On").setExact(Tv_rec.getExact()).build());
		        		}
		        }
		        for(TVDevice.proto.tv.TV tv : tvdata.tvdata) {
		        	TVDetailResponse response = TVDetailResponse.newBuilder().setTv(tv).build();
		        	rStreamObserver.onNext(response);
		        	rStreamObserver.onCompleted();
		            return;
		        }
		    }
			public void tVOff(update_request request, StreamObserver<TVDetailResponse> rStreamObserver) {
		    	ArrayList<TVDevice.proto.tv.TV> tvList = tvdata.getInstance();
		        for(int i=0; i<tvList.size(); i++) {
		        		if(tvList.get(i).getTvId() == request.getTvId()) {	
		        			TVDevice.proto.tv.TV Tv_rec = (TVDevice.proto.tv.TV) tvList.get(i);
		        			tvdata.tvdata.clear();
		        			tvdata.tvdata.add(TVDevice.proto.tv.TV.newBuilder().setTvId(Tv_rec.getTvId()).setDeviceLocation(Tv_rec.getDeviceLocation()).setStatus("Off").setExact(Tv_rec.getExact()).build());
		        		}
		        }
		        for(TVDevice.proto.tv.TV tv : tvdata.tvdata) {
		        	TVDetailResponse response = TVDetailResponse.newBuilder().setTv(tv).build();
		        	rStreamObserver.onNext(response);
		        	rStreamObserver.onCompleted();
		            return;
		        }
		    }
			public void setExactVolume(exact_update requestExact_update, StreamObserver<TVDetailResponse> rStreamObserver) {
		    	ArrayList<TVDevice.proto.tv.TV> tvList = tvdata.getInstance();
		    	 for(int i=0; i<tvList.size(); i++) {
		    		 if(tvList.get(i).getTvId() == requestExact_update.getTvId()) {	
		        			TVDevice.proto.tv.TV Tv_rec = (TVDevice.proto.tv.TV) tvList.get(i);
		        			tvdata.tvdata.clear();
		        			int exact = requestExact_update.getExactRequest();
		        			tvdata.tvdata.add(TVDevice.proto.tv.TV.newBuilder().setTvId(Tv_rec.getTvId()).setDeviceLocation(Tv_rec.getDeviceLocation()).setStatus(Tv_rec.getDeviceLocation()).setExact(exact).build());

		    		 }
		    		 
		    		 
		    	 }
		    	 for(TVDevice.proto.tv.TV tv : tvdata.tvdata) {
			        	TVDetailResponse response = TVDetailResponse.newBuilder().setTv(tv).build();
			        	rStreamObserver.onNext(response);
			        	rStreamObserver.onCompleted();
			            return;
			        }

				
			}


}
