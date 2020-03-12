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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class FlightBooking {

	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int flightbookingId;	
	private String source;
	private String destination;
	private Date journeyDate;

	
	public int getFlightbookingId() {
		return flightbookingId;
	}

	public void setFlightbookingId(int flightbookingId) {
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

	


}
