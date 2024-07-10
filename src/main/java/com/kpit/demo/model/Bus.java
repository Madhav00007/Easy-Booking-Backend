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
@Table(name="BusTable")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="pnr")
	private int pnr;
	@Column(name="BusNumber")
	private String busNumber;
	@Column(name="BusName")
	private String busName;
 
	@Column(name="BusType")
	private String type;
 
	@Column(name="DepartureTime")
	private String departure;
	@Column(name="ReportingTime")
	private String reporting;
	@Column(name="Source")
	private String source;
	@Column(name="Destination")
	private String destination;
	@Column(name="JourneyDate")
	private Date date;
	@OneToOne
	@JoinColumn(name="id", referencedColumnName="id")
	private Passenger passenger;
	@OneToOne
	@JoinColumn(name="id",referencedColumnName="id")
	private Payment payment;
	public Bus() {}
	public Bus(int id, String busNumber, String busName, String type, String departure, String reporting, String source,
			String destination, Date date, int pnr) {
		super();
		this.id = id;
		this.busNumber = busNumber;
		this.busName = busName;
		this.type = type;
		this.departure = departure;
		this.reporting = reporting;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.pnr = pnr;
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
 
	public String getType() {
		return type;
	}
 
	public void setType(String type) {
		this.type = type;
	}
	public String getBusNumber() {
		return busNumber;
	}
 
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusName() {
		return busName;
	}
 
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getDeparture() {
		return departure;
	}
 
	public void setDeparture(String departure) {
		this.departure = departure;
	}
 
	public String getReporting() {
		return reporting;
	}
 
	public void setReporting(String reporting) {
		this.reporting = reporting;
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
}
