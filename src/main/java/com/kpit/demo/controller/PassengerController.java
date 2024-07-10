package com.kpit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo.model.Passenger;
import com.kpit.demo.service.PassengerService;

 
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class PassengerController {
	@Autowired
	private PassengerService passService;
	@PostMapping("/passengers")
    public Passenger addData(@RequestBody Passenger obj) {
        return passService.createNewPassenger(obj);
    }
    @GetMapping("/pass/{pnr}")
	public List<Passenger> getTrain(@PathVariable("pnr") int pnr){
		return passService.getPassengerByPnr(pnr);
	}
}
