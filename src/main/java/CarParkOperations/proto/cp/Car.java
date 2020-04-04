package CarParkOperations.proto.cp;

import java.util.ArrayList;

import com.google.rpc.Status;


public class Car extends ArrayList<CarPark>{
	
	public static Car carparkCar;
	
	public static Car getInstance() {
		if(carparkCar == null) {
			carparkCar = new Car();
		}
		return carparkCar;
		
	}
	public Car() {
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(1).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(2).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(3).setStatus("Full").setLocation("Behind Building 4").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(4).setStatus("Full").setLocation("Behind Building 3").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(5).setStatus("Full").setLocation("Behind Building 2").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(6).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(7).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(10).setStatus("Full").setLocation("Behind Building 6").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(11).setStatus("Full").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(12).setStatus("Spaces").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(13).setStatus("Spaces").setLocation("Behind Building 1").build());
		this.add(CarParkOperations.proto.cp.CarPark.newBuilder().setCarParkId(14).setStatus("Spaces").setLocation("Behind Building 1").build());		
	}
}
