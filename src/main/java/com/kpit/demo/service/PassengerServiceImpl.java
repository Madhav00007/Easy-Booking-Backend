package com.kpit.demo.service;

import java.util.List;
import java.util.stream.Collectors;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo.model.Passenger;
import com.kpit.demo.repository.PassengerRepository;
 

 
@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	PassengerRepository passRepo;
	@Override
    public Passenger createNewPassenger(Passenger pass) {
        return passRepo.save(pass);
    }
 
	@Override
	public List<Passenger> getPassengerByPnr(int pnr) {
		List<Passenger> passList = (List<Passenger>) passRepo.findAll();
		List<Passenger> filteredBusList = passList.stream()
                .filter(pass -> pass.getPnr() == pnr)
                .collect(Collectors.toList());
		return filteredBusList;
	}
 
}
