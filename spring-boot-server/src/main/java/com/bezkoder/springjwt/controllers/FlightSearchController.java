package com.bezkoder.springjwt.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.Service.FlightService;
import com.bezkoder.springjwt.models.ScheduledFlight;
import com.bezkoder.springjwt.models.SearchFlight;
@RestController
@RequestMapping("/api/v1.0/")
public class FlightSearchController {
	@Autowired
	FlightService flightService;
	  @PostMapping("flight/search")  
		public List<ScheduledFlight> flightSearch(@RequestBody SearchFlight searchFlight){
		  
		  List<ScheduledFlight> list = this.flightService.getAllSearchFlight(searchFlight);   
	    	return list;
		  
		  
		  
		 
    }

}
