package com.kpit.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo.model.BusPayment;

 
@Repository
public interface BusPaymentRepository extends JpaRepository<BusPayment,Integer> {
	BusPayment findByPnr(int pnr);
}
