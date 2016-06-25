package com.auto1.devtest.model;
import java.io.Serializable;

public class GeoLocation implements Serializable{
	
	private static final long serialVersionUID = -7020379325236463876L;

	private double longitude;
	private double latitude;
	
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
	
	

}
