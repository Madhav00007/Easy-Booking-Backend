package com.kpit.demo.service;


import java.util.List;
import java.util.Optional;

import com.kpit.demo.model.Bus;



public interface BusService {
	Bus createNewRecordService(Bus bus);
	List<Bus> getAllRecordsService();
	Optional<Bus> getOneRecord(int id);
}
