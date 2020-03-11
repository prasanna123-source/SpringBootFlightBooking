package com.app.booking.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int userId;
	
	@NotEmpty(message = "Please Enter UserName")
	private String userName;
    
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passengerId")
	private Passenger passenger;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
}
