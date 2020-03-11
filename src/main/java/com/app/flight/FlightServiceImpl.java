package com.app.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.FlightRepository;
import com.app.booking.model.Flight;

@Service
@Transactional
public class FlightServiceImpl {

	@Autowired
	private FlightRepository flightRepo;

//	@Override
//	public Flight getFlightById(String flightId) {
//		return flightRepo.findById(flightId).orElseThrow(() -> new FlightNotFoundException(flightId));
//	}
	
	public List<Flight> saveFlight(List<Flight> flight) {
		return flightRepo.saveAll(flight);
         
	}

	public List<Flight> getAllFlights(String sourcename) {
		return flightRepo.findByFlightSource(sourcename);
	}

}
