package com.bezkoder.springjwt.models;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ScheduledFlight {
	@Id
	@Column(name = "schedule_flight_id")
	private BigInteger scheduleFlightId;

	@OneToOne(cascade = CascadeType.ALL)
	private Flight flight;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Schedule schedule;


	public BigInteger getScheduleFlightId() {
		return scheduleFlightId;
	}

	public void setScheduleFlightId(BigInteger scheduleFlightId) {
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
