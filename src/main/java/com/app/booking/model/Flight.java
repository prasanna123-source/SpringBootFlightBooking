package com.app.booking.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Flight {
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int flightId;
	
	//@NotEmpty(message = "Please Enter airlineName")
	private String flightName;
	private String source;
	private String destination;
	private Date journeyDate;
	
	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinTable(name = "Flight_bookings_join", 
	joinColumns = @JoinColumn(name="flightId"),
	inverseJoinColumns = @JoinColumn(name="flightbookingId"))	
	private Set<FlightBooking> bookings;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flightAvailabilityId")
    private FlightAvailability flightAvailability;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
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

	public Set<FlightBooking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<FlightBooking> bookings) {
		this.bookings = bookings;
	}

	public FlightAvailability getFlightAvailability() {
		return flightAvailability;
	}

	public void setFlightAvailability(FlightAvailability flightAvailability) {
		this.flightAvailability = flightAvailability;
	}	
	
}
