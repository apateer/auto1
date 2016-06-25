package com.auto1.devtest.model;
import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Location implements Serializable {

	private static final long serialVersionUID = -2351297638862548163L;

	@JsonProperty("_id")
	private long id;

	private String key;

	private String name;

	private String fullName;

	@JsonProperty("iata_airport_code")
	private String iataAirportCode;

	private String type;

	private String country;

	@JsonProperty("geo_position")
	private GeoLocation location;

	@JsonProperty("locationId")
	private long locationId;

	@JsonProperty("inEurope")
	private boolean inEurope;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("coreCountry")
	private boolean coreCountry;

	@JsonProperty("distance")
	private long distance;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIataAirportCode() {
		return iataAirportCode;
	}

	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoLocation getLocation() {
		return location;
	}

	public void setLocation(GeoLocation location) {
		this.location = location;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public boolean isInEurope() {
		return inEurope;
	}

	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isCoreCountry() {
		return coreCountry;
	}

	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

}
