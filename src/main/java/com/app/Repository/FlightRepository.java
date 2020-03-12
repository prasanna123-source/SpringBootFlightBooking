package com.app.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.booking.model.Flight;
import com.app.booking.model.FlightBooking;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {	

	@Query("select t from Flight t where t.source= :source and t.destination= :destination and t.journeyDate= :journeyDate")
	public List<Flight> findByFlightSource(@Param("source") String source,@Param("destination") String destination,@Param("journeyDate") Date journeyDate);

//	public Optional<FlightBooking> findOne(String flightID);
}
