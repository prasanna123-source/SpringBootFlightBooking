package com.app.booking.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class FlightBooking {

	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private String flightbookingId;
	
//	private Passenger passenger;
//	private Flight flight;
	
	@ManyToMany(mappedBy = "bookings", fetch = FetchType.LAZY)
	private Set<Flight> flights;
	
	private String source;
	private String destination;
	private Date journeyDate;
	

	public String getFlightbookingId() {
		return flightbookingId;
	}

	public void setFlightbookingId(String flightbookingId) {
		this.flightbookingId = flightbookingId;
	}

	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}


}
