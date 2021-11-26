package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightNo;
	private String flightName;
	private int duration;
	private String instrumentUsed;
	private String meal;
	private boolean activeFlight;
	@OneToOne(mappedBy = "flight")
	private ScheduledFlight scheduledFlight;
	
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Flight() {
		super();
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public boolean isActiveFlight() {
		return activeFlight;
	}
	public void setActiveFlight(boolean activeFlight) {
		this.activeFlight = activeFlight;
	}
	
	
	}
	

	


