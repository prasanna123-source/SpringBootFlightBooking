package com.app.booking.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FlightAvailability {
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int flightAvailabilityId;
	private int userId;
	private int passengerId;
    private boolean availability;
    private String toLocation;
    private String fromLocation;
    
    @OneToOne(mappedBy = "flightAvailability")            
    private Flight flight;
    
	public int getFlightAvailabilityId() {
		return flightAvailabilityId;
	}
	public void setFlightAvailabilityId(int flightAvailabilityId) {
		this.flightAvailabilityId = flightAvailabilityId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
    
    
}
