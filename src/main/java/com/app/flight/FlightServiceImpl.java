package com.app.flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	
	public List<Flight> getAllFlights(String sourcename,String destination,String journeyDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");		 			
		 Date date1 = null;
		try {
			date1 = formatter.parse(journeyDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flightRepo.findByFlightSource(sourcename,destination,date1);
	}

}
