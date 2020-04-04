package models.java;

public class Heating {
	   private String heatingRequest;
	   private String heatingChange;
	   private int exactHeating;
	   
	   
	   private Heating() {
		   
		   
	   }
	   
	   private Heating(String heatingRequest, String heatingChange, int exactHeating) {
		   this.heatingRequest = heatingRequest;
		   this.heatingChange = heatingChange;
		   this.exactHeating = exactHeating;
	   }
	   public String getHeatingRequest() {
	        return heatingRequest;
	    }

	    public void setHeatingRequest(String heatingRequest) {
	        this.heatingRequest = heatingRequest;
	    }
	    public String getHeatingChange() {
	        return heatingChange;
	    }

	    public void setHeatingChange(String heatingChange) {
	        this.heatingChange = heatingChange;
	    }
	    public int getExactHeating() {
	        return exactHeating;
	    }

	    public void setExactHeating(int exactHeating) {
	        this.exactHeating = exactHeating;
	    }
}
