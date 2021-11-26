package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Flight;
import com.bezkoder.springjwt.models.ScheduledFlight;

@Repository
public interface FlightRepository extends JpaRepository<ScheduledFlight, Integer>{

}
