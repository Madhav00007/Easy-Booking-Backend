package com.kpit.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.Table;

@Entity
@Table(name = "TrainTicketPayments")
public class Payment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Payment_Id")
	    private long paymentId;
	    
	    @Column(name = "Pay_Amount")
	    private int payAmount;
	    
	    @Column(name = "Upi_Id")
	    private String upiId;
	    
	    @Column(name="Pay_Status")
	    private String payStatus;
	    
	    public Payment() {}

		public Payment(long paymentId, int payAmount, String upiId, String payStatus) {
			super();
			this.paymentId = paymentId;
			this.payAmount = payAmount;
			this.upiId = upiId;
			this.payStatus = payStatus;
		}

		public long getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(long paymentId) {
			this.paymentId = paymentId;
		}

		public int getPayAmount() {
			return payAmount;
		}

		public void setPayAmount(int payAmount) {
			this.payAmount = payAmount;
		}

		public String getUpiId() {
			return upiId;
		}

		public void setUpiId(String upiId) {
			this.upiId = upiId;
		}

		public String getPayStatus() {
			return payStatus;
		}

		public void setPayStatus(String payStatus) {
			this.payStatus = payStatus;
		}
	    
	    
	   
	   

	  

}
