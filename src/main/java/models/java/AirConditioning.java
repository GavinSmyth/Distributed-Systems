package models.java;

public class AirConditioning {
	private String airRequest;
    private String airChange;
    
    public AirConditioning(){
    	
    }
    
    public AirConditioning(String airRequest, String airChange) {
    	this.airRequest = airRequest;
    	this.airChange = airChange;
    }
    public String getAirRequest() {
        return airRequest;
    }

    public void setAirRequest(String airRequest) {
        this.airRequest = airRequest;
    }

    public String getAirChange() {
        return airChange;
    }

    public void setAirChange(String airChange) {
        this.airChange = airChange;
    }

}
