package HeatingDevice.proto.h;

import java.util.ArrayList;

public class Heat extends ArrayList<Heater>{

	public static Heat heat;
	
	public static Heat getInstance() {
		if(heat == null) {
			heat = new Heat();
		}
		return heat;
	}
	public Heat() {
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(1).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("High").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(2).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("High").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(3).setDevice("Off").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(4).setDevice("Off").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(5).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(6).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("High").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(7).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("High").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(8).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("High").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(9).setDevice("Off").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(10).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(11).setDevice("Off").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		this.add(HeatingDevice.proto.h.Heater.newBuilder().setHeaterId(12).setDevice("On").setDeviceLocation("Behind Building 1").setStatus("Low").setExactTemp(11).build());
		
	}
}
