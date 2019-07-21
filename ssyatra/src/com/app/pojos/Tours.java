package com.app.pojos;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
@Entity
@Table(name="Tours")
public class Tours {
	private Integer tourid;
	private String source;
	private TravelOwner towner;
	private String destination;
	private Date dateofjourney;
	private String arrival_time;
	private String departure_time;
	private Integer numberofseats;
	private List<TravelBooking> totalbooking=new ArrayList<TravelBooking>(); 
	private Boolean ac;
	private String type;
	private double fare;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getTourid() {
		return tourid;
	}
	public void setTourid(Integer tourid) {
		this.tourid = tourid;
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
	public Date getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public Integer getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(Integer numberofseats) {
		this.numberofseats = numberofseats;
	}
	public Boolean getAc() {
		return ac;
	}
	public void setAc(Boolean ac) {
		this.ac = ac;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

	@ManyToOne
	@JoinColumn(name="tid")
	public TravelOwner getTowner() {
		return towner;
	}
	public void setTowner(TravelOwner towner) {
		this.towner = towner;
	}
	
	@OneToMany(mappedBy = "booked_tour",cascade = CascadeType.ALL)
	public List<TravelBooking> getTotalbooking() {
		return totalbooking;
	}
	public void setTotalbooking(List<TravelBooking> totalbooking) {
		this.totalbooking = totalbooking;
	}
	
	
	public Tours(String source, TravelOwner towner, String destination, Date dateofjourney, String arrival_time,
			String departure_time, Integer numberofseats, List<TravelBooking> totalbooking, Boolean ac, String type,
			double fare) {
		super();
		this.source = source;
		this.towner = towner;
		this.destination = destination;
		this.dateofjourney = dateofjourney;
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.numberofseats = numberofseats;
		this.totalbooking = totalbooking;
		this.ac = ac;
		this.type = type;
		this.fare = fare;
	}
	public Tours() {
		super();
		System.out.println("In tour def pojo");
	}
	
	

}
