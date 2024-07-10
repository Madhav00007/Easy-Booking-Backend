package com.kpit.demo.service;

import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo.model.Bus;
import com.kpit.demo.repository.BusRepository;
 

 
@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusRepository busRepo;
	@Override
    public Bus createNewRecordService(Bus bus) {
        return busRepo.save(bus);
    }
 
    @Override
    public List<Bus> getAllRecordsService() {
        List<Bus> busList = (List<Bus>) busRepo.findAll();
        return busList;
    }
 
	@Override
	public Optional<Bus> getOneRecord(int id) {
		Optional<Bus> b = busRepo.findById(id);
		return b;
	}
 
}