package com.kpit.demo.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "Flights")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking id")
	private int booking_id;
	
	@Column(name = "seat_number")
    private int seatNumber;
    
    @Column(name = "source")
    private String source;
 
    @Column(name = "destination")
    private String destination;
    
    @Column(name = "journey_date")
    private Date date;
    
    @Column(name = "adult_number")
    private int adults;
    
    @Column(name = "children_number")
    private int children;
    
    @Column(name = "passenger_name")
    private String passengerName;
 
    @Column(name = "passenger_age")
    private int passengerAge;
    
    @Column(name = "flight_name")
    private String flightName;
 
    @Column(name = "flight_number")
    private int flightNumber;
    
    @Column(name = "student")
    private boolean student;
    
	@Column(name = "army")
    private boolean army;

	public Flight() {}

	public Flight(int booking_id, int seatNumber, String source, String destination, Date date, int adults,
			int children, String passengerName, int passengerAge, String flightName, int flightNumber, boolean student,
			boolean army) {
		super();
		this.booking_id = booking_id;
		this.seatNumber = seatNumber;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.adults = adults;
		this.children = children;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		this.student = student;
		this.army = army;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public boolean isStudent() {
		return student;
	}

	public void setStudent(boolean student) {
		this.student = student;
	}

	public boolean isArmy() {
		return army;
	}

	public void setArmy(boolean army) {
		this.army = army;
	}

	@Override
	public String toString() {
		return "Flight [booking_id=" + booking_id + ", seatNumber=" + seatNumber + ", source=" + source
				+ ", destination=" + destination + ", date=" + date + ", adults=" + adults + ", children=" + children
				+ ", passengerName=" + passengerName + ", passengerAge=" + passengerAge + ", flightName=" + flightName
				+ ", flightNumber=" + flightNumber + ", student=" + student + ", army=" + army + "]";
	}

	
	


//    public Flight(int seatNumber, int trainNumber, String trainName, String dateOfJourney, String pName, int age, String source, String destination) {
//        this.seatNumber = seatNumber;
//        this.flightNumber = trainNumber;
//        this.flightName = trainName;
//        this.date = dateOfJourney;
//        this.passengerName = pName;
//        this.passengerAge = age;
//        this.source = source;
//        this.destination = destination;
//    }

	
    
 
	

}
