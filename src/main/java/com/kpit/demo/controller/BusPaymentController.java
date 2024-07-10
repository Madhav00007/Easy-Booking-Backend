package com.kpit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo.model.BusPayment;
import com.kpit.demo.service.BusPaymentService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class BusPaymentController {
	@Autowired
	private BusPaymentService payService;
	@PostMapping("/buspayments")
   public BusPayment addData(@RequestBody BusPayment obj) {
       return payService.createNewPayment(obj);
   }
	@GetMapping("/buspayments")
	public List<BusPayment> getAllPayment() {
		return payService.getPaymentList();
	}
   @GetMapping("/buspayments/{pnr}")
	public BusPayment getOnePayment(@PathVariable("pnr") int pnr){
		return payService.getPaymentByPnr(pnr);
	}

}