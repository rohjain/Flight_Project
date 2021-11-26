package com.bezkoder.springjwt.models;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Passenger {
	@Id
	private int pnrNumber;
	private String passengerName;
	private int passengerAge;
	private int passengerEmail;
	private String gender;
	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(int passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Passenger() {
		super();
	}
	
}
