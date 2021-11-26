package com.bezkoder.springjwt.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;

	@OneToOne(cascade = CascadeType.ALL)
	private Airport srcAirport;

	@OneToOne(cascade = CascadeType.ALL)
	private Airport dstnAirport;
	
	@Column(name = "departure_date")
	//pattern = "mm-dd-yyyy HH:mm:ss")
	private Date deptDateTime;

	@Column(name = "arrival_date")
	private Date arrDateTime;
	
	@OneToOne(mappedBy = "schedule")
	private ScheduledFlight scheduledFlight;

	

	public int getScheduleId() {
		return scheduleId;
	}



	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}



	public Airport getSrcAirport() {
		return srcAirport;
	}



	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}



	public Airport getDstnAirport() {
		return dstnAirport;
	}



	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}



	public Date getDeptDateTime() {
		return deptDateTime;
	}



	public void setDeptDateTime(Date deptDateTime) {
		this.deptDateTime = deptDateTime;
	}



	public Date getArrDateTime() {
		return arrDateTime;
	}



	public void setArrDateTime(Date arrDateTime) {
		this.arrDateTime = arrDateTime;
	}



	public Schedule() {
		super();
	}

	
	


}
