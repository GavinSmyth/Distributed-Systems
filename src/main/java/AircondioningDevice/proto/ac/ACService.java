package AircondioningDevice.proto.ac;

import java.util.ArrayList;

import AircondioningDevice.proto.ac.Air;
import AircondioningDevice.proto.ac.ACResponse;

import AircondioningDevice.proto.ac.Air;

import AircondioningDevice.proto.ac.ACResponse;
import AircondioningDevice.proto.ac.Airconditioning_serviceGrpc;
import AircondioningDevice.proto.ac.deviceIDRequest;
import AircondioningDevice.proto.ac.Airconditioning_serviceGrpc.Airconditioning_serviceImplBase;

import io.grpc.stub.StreamObserver;

public class ACService extends Airconditioning_serviceGrpc.Airconditioning_serviceImplBase {
	
	public void currentDetails(deviceIDRequest request, StreamObserver<ACResponse> rStreamObserver) {
		
		ArrayList<AircondioningDevice.proto.ac.AirConditioning> temp_list = Air.getInstance();
		for(int i=0; i<temp_list.size(); i++) {
			AircondioningDevice.proto.ac.AirConditioning air_recAir = (AircondioningDevice.proto.ac.AirConditioning) temp_list.get(i);
			Air.airConditioning.clear();
			
			Air.airConditioning.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(air_recAir.getDeviceId())
                    .setName(air_recAir.getName())
                    .setLocation(air_recAir.getLocation())
                    .setStatus(air_recAir.getStatus())
                    .build());
			
			
		}
		
        for(AircondioningDevice.proto.ac.AirConditioning air : Air.airConditioning) {

        	ACResponse response = ACResponse.newBuilder().setAirConditioning(air).build();

            // this is the next response to send
        	rStreamObserver.onNext(response);
            // let the server know we are finished sending
        	rStreamObserver.onCompleted();
            return;

        }
		
	}

}
