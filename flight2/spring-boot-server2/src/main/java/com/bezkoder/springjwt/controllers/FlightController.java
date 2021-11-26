package com.bezkoder.springjwt.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.Service.FlightService;
import com.bezkoder.springjwt.models.Flight;
import com.bezkoder.springjwt.models.ScheduledFlight;


@RestController
@RequestMapping("/api/v1.0")
public class FlightController {
	@Autowired
	FlightService flightService;
	@PostMapping("/airlines")
	@PreAuthorize("hasRole('ADMIN')")
	 public ResponseEntity<ScheduledFlight> addFlight(@RequestBody ScheduledFlight scleduleFlight){
		ScheduledFlight sf = null;
        try{
        sf = this.flightService.addflight(scleduleFlight);
        return ResponseEntity.of(Optional.of(sf));
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
