package com.app.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.booking.model.Flight;
import com.app.booking.model.FlightBooking;

@RestController
public class BookingController {
	
	@Autowired
	private BookingServiceImpl bookingService;

	@PostMapping("/bookingFlight")
	public Flight createBookingInfo(@RequestBody Flight flight) {
		return bookingService.saveBooking(flight);
	}	

}
