package com.kpit.demo.model;



 
import java.util.Date;
 
import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
 
@Entity

@Table(name="payment_tbl")

public class BusPayment {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="id")

	private int id;

	@Column(name="pnr")

	private int pnr;

	@Column(name="upi_id")

	private String upi;

	@Column(name="amount")

	private double amount;

	@Column(name="JourneyDate")

	private Date date;

	public BusPayment() {}
 
	public BusPayment(int id, int pnr, String upi, double amount, Date date) {

		super();

		this.id = id;

		this.pnr = pnr;

		this.upi = upi;

		this.amount = amount;

		this.date = date;

	}
 
	public int getId() {

		return id;

	}
 
	public void setId(int id) {

		this.id = id;

	}
 
	public int getPnr() {

		return pnr;

	}
 
	public void setPnr(int pnr) {

		this.pnr = pnr;

	}
 
	public String getUpi() {

		return upi;

	}
 
	public void setUpi(String upi) {

		this.upi = upi;

	}
 
	public double getAmount() {

		return amount;

	}
 
	public void setAmount(double amount) {

		this.amount = amount;

	}

	public Date getDate() {

		return date;

	}
 
	public void setDate(Date date) {

		this.date = date;

	}

}

