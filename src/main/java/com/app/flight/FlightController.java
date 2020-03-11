package com.app.flight;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.booking.model.Flight;

@RestController
public class FlightController {
	
	@Autowired
	private FlightServiceImpl flightService;	
	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);
	
	
	@PostMapping("/saveAllFlights")
	public @ResponseBody List<Flight> saveAllFlights(List<Flight> flight) {
		return flightService.saveFlight(flight);
	}
	
	@GetMapping("/getAllFlights")
	public @ResponseBody List<Flight> getAllFlights(String source) {
		return flightService.getAllFlights(source);
	}
	
//	@GetMapping("/{flight-id}")
//	public @ResponseBody Flight getFlightById(@PathVariable("flight-id") String flightId) {
//		return flightService.getFlightById(flightId);
//	}
}
