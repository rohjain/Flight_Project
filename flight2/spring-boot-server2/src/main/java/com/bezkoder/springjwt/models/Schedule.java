package com.bezkoder.springjwt.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Schedule {
	@Id
	@Column(name = "schedule_Id")
	private Integer scheduleId;

	@OneToOne(cascade = CascadeType.ALL)
	private Airport srcAirport;

	@OneToOne(cascade = CascadeType.ALL)
	private Airport dstnAirport;
	
	@Column(name = "departure_date")
//	pattern = "mm-dd-yyyy HH:mm:ss")
	private String deptDateTime;

	@Column(name = "arrival_date")
	private String arrDateTime;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ScheduledFlight scheduledFlight;

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
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

	public String getDeptDateTime() {
		return deptDateTime;
	}

	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}

	public String getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}

	public Schedule() {
		super();
	}

	public ScheduledFlight getScheduledFlight() {
		return scheduledFlight;
	}

	public void setScheduledFlight(ScheduledFlight scheduledFlight) {
		this.scheduledFlight = scheduledFlight;
	}

	
	


}
