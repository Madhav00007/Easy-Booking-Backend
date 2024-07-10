package com.kpit.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo.model.BusPayment;
import com.kpit.demo.repository.BusPaymentRepository;


@Service
public class BusPaymentServiceImpl implements BusPaymentService{
	@Autowired
	BusPaymentRepository payRepo;

	@Override
	public BusPayment createNewPayment(BusPayment pay) {
		return payRepo.save(pay);
	}

	@Override
	public BusPayment getPaymentByPnr(int pnr) {
		BusPayment p = payRepo.findByPnr(pnr);
		return p;
	}

	@Override
	public List<BusPayment> getPaymentList() {
		List<BusPayment> payList = (List<BusPayment>) payRepo.findAll();
       return payList;
	}

}

