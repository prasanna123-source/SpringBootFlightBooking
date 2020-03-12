package com.app.booking;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.FlightBookingRepository;
import com.app.Repository.FlightRepository;
import com.app.booking.model.Flight;
import com.app.booking.model.FlightBooking;

@Service
@Transactional
public class BookingServiceImpl {
	private static final Logger logger = LoggerFactory.getLogger(BookingServiceImpl.class);

	@Autowired
	private FlightRepository flightRepo;	
	
//	public Optional<FlightBooking> getBooking(Integer bookingId) {
//		return bookingRepo.findById(bookingId);
//	}
	
	public Flight saveBooking(Flight flight) {
		return flightRepo.save(flight);
}
}
