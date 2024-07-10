package com.kpit.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo.model.Payment;
import com.kpit.demo.model.Train;
import com.kpit.demo.repository.PaymentRepository;
import com.kpit.demo.repository.TrainRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/payments")
public class PaymentController {
	@Autowired
	private PaymentRepository paymentRepository;
	
	 @GetMapping
	    public ResponseEntity<List<Payment>> getAllPayments() {
	        List<Payment> payments = paymentRepository.findAll();
	        return ResponseEntity.ok(payments);
	    }
	 @PostMapping
	    public Payment createPayment(@RequestBody Payment payment) {
	        return paymentRepository.save(payment);
	    }
	 @GetMapping("/payment/{id}")
//		@GetMapping("/{id}")
		public Optional<Payment> getTrain(@PathVariable("id") int id){
			return paymentRepository.findById((long) id);
			
		}

}
