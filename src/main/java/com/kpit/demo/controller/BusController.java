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

import com.kpit.demo.model.Bus;
import com.kpit.demo.service.BusService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class BusController {
	@Autowired
	private BusService busService;
	@PostMapping("/records")
   public Bus addData(@RequestBody Bus obj) {
       return busService.createNewRecordService(obj);
   }
   @GetMapping("/records")
   public List<Bus> getData() {
       return busService.getAllRecordsService();
   }
   @GetMapping("/bus/{id}")
	public Optional<Bus> getTrain(@PathVariable("id") int id){
		return busService.getOneRecord(id);
	}  
}
