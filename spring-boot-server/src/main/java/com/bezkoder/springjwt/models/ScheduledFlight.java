package com.bezkoder.springjwt.models;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class ScheduledFlight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleFlightId;
	
	private boolean isActive;

	@OneToOne(cascade = CascadeType.ALL)
	private Flight flight;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Schedule schedule;

	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getScheduleFlightId() {
		return scheduleFlightId;
	}

	public void setScheduleFlightId(int scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public ScheduledFlight() {

	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

}
