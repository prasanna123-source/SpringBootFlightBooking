package com.app.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.booking.model.FlightBooking;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {	
	
	//public List<Flight> findBysourceDestinationJouneyDate(String source,String Destination,Date JouneyDate );
}
