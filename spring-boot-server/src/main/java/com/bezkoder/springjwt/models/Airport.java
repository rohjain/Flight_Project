package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Airport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airportCode;
	private String airportName;
	private String place;
	@OneToOne
	private Schedule schedule;
	
	public int getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Airport() {
		super();
	}
	
	
	
	
	

}
