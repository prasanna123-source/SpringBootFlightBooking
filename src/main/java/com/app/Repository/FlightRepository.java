package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.booking.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {	

	@Query("select t from Flight t where t.source= :source")
	public List<Flight> findByFlightSource(@Param("source") String source);
}
