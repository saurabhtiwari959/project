package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Travel_Booking")
public class TravelBooking {
	private Integer bid;
	private Tours tid;
	private Integer Seatno;
	private Integer price;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBid() {
		return bid;
	}
	
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	
	
	@Column(length = 10)
	public Integer getSeatno() {
		return Seatno;
	}
	public void setSeatno(Integer seatno) {
		Seatno = seatno;
	}
	@Column(length = 10)
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public TravelBooking(Tours booked_tour, Integer seatno, Integer price) {
		super();
		this.tid = booked_tour;
		Seatno = seatno;
		this.price = price;
	}
	public TravelBooking() {
		super();
		
	System.out.println("in booking def..!");
	}
	
	@ManyToOne
	@JoinColumn(name="tourid")
	public Tours getBooked_tour() {
		return tid;
	}
	public void setBooked_tour(Tours booked_tour) {
		this.tid = booked_tour;
	}




}
