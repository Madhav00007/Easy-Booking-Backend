package com.kpit.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="passenger_table")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="pnr")
	private int pnr;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="seat")
	private int seat;
	public Passenger() {}
	public Passenger(int id, int pnr, String name, int age, int seat) {
		super();
		this.id = id;
		this.pnr = pnr;
		this.name = name;
		this.age = age;
		this.seat = seat;
	}
	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getId() {
		return id;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
