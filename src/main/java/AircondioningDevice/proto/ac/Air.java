package AircondioningDevice.proto.ac;

import java.util.ArrayList;

public class Air extends ArrayList<AirConditioning>{
	
	public static Air airConditioning;
	
	public static Air getInstance() {
		if(airConditioning == null) {
			airConditioning = new Air();
		}
		return airConditioning;
		
	}
	public Air() {
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(1).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(2).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(3).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(4).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(5).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(6).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(7).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(8).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(9).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(10).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(11).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(12).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(13).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(14).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
		this.add(AircondioningDevice.proto.ac.AirConditioning.newBuilder().setDeviceId(15).setName("device1").setLocation("Room1").setStatus("on").setNewTempature(11).build());
	}
	

}
