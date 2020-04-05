package TVDevice.proto.tv;

import java.util.ArrayList;



public class tvdata extends ArrayList<TV>{
	public static tvdata tvdata;
	
	public static tvdata getInstance() {
		if(tvdata == null) {
			tvdata = new tvdata();
		}
		return tvdata;
	}
	public tvdata() {
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(1).setDeviceLocation("Room 1").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(2).setDeviceLocation("Room 2").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(3).setDeviceLocation("Room 3").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(4).setDeviceLocation("Room 4").setStatus("Off").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(5).setDeviceLocation("Room 5").setStatus("Off").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(6).setDeviceLocation("Room 6").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(7).setDeviceLocation("Room 7").setStatus("Off").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(8).setDeviceLocation("Room 8").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(9).setDeviceLocation("Behind Building 1").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(10).setDeviceLocation("Behind Building 1").setStatus("On").setExact(11).build());
		this.add(TVDevice.proto.tv.TV.newBuilder().setTvId(11).setDeviceLocation("Behind Building 1").setStatus("On").setExact(11).build());


	}
	

}
