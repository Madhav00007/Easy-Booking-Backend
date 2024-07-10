package com.kpit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpit.demo.model.Payment;


public interface PaymentRepository extends JpaRepository<Payment,Long>{

}
