package models.java;

public class CarPark {
	 private String carRequest;
	 private String carChange;
	
	 public CarPark(){
	        
	    }
	    
	    public CarPark(String carRequest, String carChange) {
	        this.carRequest = carRequest;
	        this.carChange = carChange;
	    }

	    public String getCarRequest() {
	        return carRequest;
	    }

	    public void setCarRequest(String carRequest) {
	        this.carRequest = carRequest;
	    }

	    public String getCarChange() {
	        return carChange;
	    }

	    public void setCarChange(String carChange) {
	        this.carChange = carChange;
	    }

}
