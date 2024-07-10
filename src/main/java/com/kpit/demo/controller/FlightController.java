package com.kpit.demo.controller;


import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
//import com.kpit.demo.exception.ResourceNotFoundException;
import com.kpit.demo.model.Flight;
import com.kpit.demo.repository.FlightRepository;
 
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/")
public class FlightController {
	@Autowired
	private FlightRepository flightRepository;
	@GetMapping("/flights")
	public List<Flight> getAllFlight(){
		return flightRepository.findAll();
	}
	@PostMapping("/newflight")
	public Flight createFlight(@RequestBody Flight newflight) {
		
//		Flight flight = new Flight();
//		flight.setSeatNumber(newflight.getSeatNumber());
//		flight.setSource(newflight.getSource());
//		flight.setDestination(newflight.getDestination());
//		flight.setDate(newflight.getDate());
//		flight.setTime(newflight.getTime());
//		flight.setAdults(newflight.getAdults());
//		flight.setChildren(newflight.getChildren());
//		flight.setPassengerName(newflight.getPassengerName());
//		flight.setPassengerAge(newflight.getPassengerAge());
//		flight.setFlightName(newflight.getFlightName());
//		flight.setFlightNumber(newflight.getFlightNumber());
//		flight.setStudent(newflight.isStudent());
//		flight.setArmy(newflight.isArmy());
		
		System.out.println(newflight.getPassengerName());
		return flightRepository.save(newflight);
	}
//	@GetMapping("/flight")
//	public Optional<Flight> getFlight(Flight obj){
//		return flightRepository.findById(obj.getSeatNumber());
//	}
 
 
}
