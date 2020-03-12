package com.app.booking.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Flight {
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int flightId;
	
	//@NotEmpty(message = "Please Enter airlineName")
	private String flightName;
	private String source;
	private String destination;
	private int noOfSeats;
	

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Temporal(value=TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date journeyDate;
	
	@OneToMany(cascade = CascadeType.ALL)	
	private List<FlightBooking> bookings;
	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "flightAvailabilityId")
//    private FlightAvailability flightAvailability;

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
		
	public List<FlightBooking> getBookings() {
		return bookings;
	}

	public void setBookings(List<FlightBooking> bookings) {
		this.bookings = bookings;
	}

//	public FlightAvailability getFlightAvailability() {
//		return flightAvailability;
//	}
//
//	public void setFlightAvailability(FlightAvailability flightAvailability) {
//		this.flightAvailability = flightAvailability;
//	}	
	
}
