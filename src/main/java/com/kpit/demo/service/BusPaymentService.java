package com.kpit.demo.service;


import java.util.List;

import com.kpit.demo.model.BusPayment;
 
public interface BusPaymentService {
	BusPayment createNewPayment(BusPayment pay);
	BusPayment getPaymentByPnr(int pnr);
	List<BusPayment> getPaymentList();
}