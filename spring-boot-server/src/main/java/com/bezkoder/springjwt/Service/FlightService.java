package com.bezkoder.springjwt.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bezkoder.springjwt.models.ScheduledFlight;
import com.bezkoder.springjwt.models.SearchFlight;
import com.bezkoder.springjwt.repository.FlightRepository;
@Component
public class FlightService {
	@Autowired
	FlightRepository flightRepository;
	 public ScheduledFlight addflight(ScheduledFlight scheduledFlight) {
		 ScheduledFlight sf = this.flightRepository.save(scheduledFlight);
		 
	        return sf;
	    }
	 
     public List<ScheduledFlight> getAllFlight(){
    
    	 List<ScheduledFlight> sf=  this.flightRepository.findAll();
    	 
         return sf;
     }
     public List<ScheduledFlight> getAllSearchFlight(SearchFlight searchFlight){
    	    
    	 List<ScheduledFlight> list=  this.flightRepository.findAll();
    	 List<ScheduledFlight> sf_list = new ArrayList<>();
   
	    	sf_list= list.stream().filter( i -> i.getSchedule().getSrcAirport().getPlace().equals(searchFlight.getSource()) && i.getSchedule().getDstnAirport().getPlace().equals(searchFlight.getDestination()) && i.isActive()==true && i.getSchedule().getDeptDateTime().toString().equals(searchFlight.getDateTime().toString())).collect(Collectors.toList());
	    	if(searchFlight.isRoundTrip()==true) {
	    		List<ScheduledFlight> temp = new ArrayList<>();
	    		temp=list.stream().filter( i -> i.getSchedule().getSrcAirport().getPlace().equals(searchFlight.getDestination()) && i.getSchedule().getDstnAirport().getPlace().equals(searchFlight.getSource())  && i.isActive()==true && i.getSchedule().getDeptDateTime().equals(searchFlight.getDateTime())).collect(Collectors.toList());
	    		sf_list.addAll(temp);
	    	}   

         return sf_list;
     }
     }


