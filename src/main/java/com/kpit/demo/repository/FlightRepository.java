package com.kpit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.kpit.demo.model.Flight;
 
public interface FlightRepository extends JpaRepository<Flight,Long> {
 
}