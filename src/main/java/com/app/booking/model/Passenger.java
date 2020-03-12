package com.app.booking.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passenger {
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int passengerId;
	
	@OneToOne(mappedBy = "passenger",cascade=CascadeType.ALL)    
	private User user;
	
	//@NotEmpty(message = "Please Enter passengerName")
	private String passengerName;
	
	//@NotEmpty(message = "Please Enter age")
	private String age;
	
	//@NotEmpty(message = "Please Enter gender")
	private String gender;
	
	//@NotEmpty(message = "Please Enter mealpreference")
	private String mealPreference;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMealPreference() {
		return mealPreference;
	}

	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}
	
	
}
