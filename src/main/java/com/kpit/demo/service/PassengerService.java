package com.kpit.demo.service;


import java.util.List;

import com.kpit.demo.model.Passenger;
 
 
public interface PassengerService {
	Passenger createNewPassenger(Passenger pass);
	List<Passenger> getPassengerByPnr(int pnr);
}