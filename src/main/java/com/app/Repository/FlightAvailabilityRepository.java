package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.booking.model.FlightAvailability;

public interface FlightAvailabilityRepository extends JpaRepository<FlightAvailability, Integer> {
 
}
