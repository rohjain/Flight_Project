package com.bezkoder.springjwt.models;

import java.sql.Date;

public class SearchFlight {
	 private Date dateTime;
	    private String source;
	    private boolean roundTrip;
	    private String destination;
		public Date getDateTime() {
			return dateTime;
		}
		public void setDateTime(Date dateTime) {
			this.dateTime = dateTime;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public boolean isRoundTrip() {
			return roundTrip;
		}
		public void setRoundTrip(boolean roundTrip) {
			this.roundTrip = roundTrip;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
	    
	}



