package com.kpit.demo.controller;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.kpit.demo.model.Train;
import com.kpit.demo.repository.TrainRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
//@RequestMapping("/Trains")
public class TrainController {
	@Autowired
	private TrainRepository trainRepository;
	
	@GetMapping("/trains")
	//@GetMapping("/tickets")
	public List<Train>getAllTrain(){
		return trainRepository.findAll();
		
	}
	
	@PostMapping("/trains")
	//@PostMapping
	public Train createTrain(@RequestBody Train train) {
		return trainRepository.save(train);
	}
	
	@GetMapping("/train/{id}")
//	@GetMapping("/{id}")
	public Optional<Train> getTrain(@PathVariable("id") int id){
		return trainRepository.findById((long) id);
		
	}


}
