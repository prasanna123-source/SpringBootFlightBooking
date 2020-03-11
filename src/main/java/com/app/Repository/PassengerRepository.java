package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.booking.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> { 
	

}
