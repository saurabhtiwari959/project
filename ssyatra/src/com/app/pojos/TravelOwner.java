package com.app.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Travel_Owner")
public class TravelOwner {
private Integer tid;
private String tname;
private String uname;
private List<Tours> tours=new ArrayList<>();
private String password;
private Date dob;
private String conact;
private String gstNumber;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getTid() {
	return tid;
}
public void setTid(Integer tid) {
	this.tid = tid;
}
@Column(length = 20)
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
@Column(length = 20)
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
@Column(length = 20)
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Temporal(TemporalType.DATE)
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
@Column(length = 20)
public String getConact() {
	return conact;
}
public void setConact(String conact) {
	this.conact = conact;
}
@Column(length = 20)
public String getGstNumber() {
	return gstNumber;
}
public void setGstNumber(String gstNumber) {
	this.gstNumber = gstNumber;
}

@OneToMany(mappedBy = "towner",cascade = CascadeType.ALL)
public List<Tours> getTours() {
	return tours;
}
public void setTours(List<Tours> tours) {
	this.tours = tours;
}

public TravelOwner(String tname, String uname,  String password, Date dob, String conact,
		String gstNumber) {
	super();
	this.tname = tname;
	this.uname = uname;
	
	this.password = password;
	this.dob = dob;
	this.conact = conact;
	this.gstNumber = gstNumber;
}

public TravelOwner() {
	super();
	System.out.println("IN Travel Owner Def pojo..!");
}



}
