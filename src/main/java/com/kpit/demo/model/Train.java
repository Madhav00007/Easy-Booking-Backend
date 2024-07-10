package com.kpit.demo.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TicketDetails")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_number")
    private long seatNumber;

    @Column(name = "train_number")
    private long trainNumber;

    @Column(name = "train_name")
    private String trainName;

    @Column(name = "journey_date")
    private Date dateOfJourney;

    @Column(name = "passenger_name")
    private String pName;

    @Column(name = "passenger_age")
    private int age;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String destination;

    @Column(name = "coach")
    private String coach;

    @Column(name = "birth_preference")
    private String birthPreference;
    
    
    @OneToOne
    @JoinColumn(name = "seat_number", referencedColumnName = "payment_id")
    private Payment payment; 

    public Train() {}

	public Train(long seatNumber, long trainNumber, String trainName, Date dateOfJourney, String pName, int age,
			String source, String destination, String coach, String birthPreference, Payment payment) {
		super();
		this.seatNumber = seatNumber;
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.dateOfJourney = dateOfJourney;
		this.pName = pName;
		this.age = age;
		this.source = source;
		this.destination = destination;
		this.coach = coach;
		this.birthPreference = birthPreference;
		this.payment = payment;
	}

	public long getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(long seatNumber) {
		this.seatNumber = seatNumber;
	}

	public long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getBirthPreference() {
		return birthPreference;
	}

	public void setBirthPreference(String birthPreference) {
		this.birthPreference = birthPreference;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	
}
