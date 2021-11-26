package com.bezkoder.springjwt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.Service.BookingService;


@RestController
@RequestMapping("/api/v1.0/")
public class BookingController {
	@Autowired
	BookingService bookingService;
	@PostMapping("flight/booking/{flightId}")  
	public void bookFlight(@PathVariable("flightId") int flightId ) {
		System.out.println("test");
	}
}
