package models.java;

public class TV {
	   private String tvRequest;
	   private String tvChange;
	   private int exactVolume;
	   
	   
	   private TV() {
		   
		   
	   }
	   
	   private TV(String tvRequest, String tvChange, int exactVolume) {
		   this.tvRequest = tvRequest;
		   this.tvChange = tvChange;
		   this.exactVolume = exactVolume;
	   }
	   public String getTvRequest() {
	        return tvRequest;
	    }

	    public void setTvRequest(String tvRequest) {
	        this.tvRequest = tvRequest;
	    }
	    public String getTvChange() {
	        return tvChange;
	    }

	    public void setTvChange(String tvChange) {
	        this.tvChange = tvChange;
	    }
	    public int getExactVolume() {
	        return exactVolume;
	    }

	    public void setExactVolume(int exactVolume) {
	        this.exactVolume = exactVolume;
	    }

}
