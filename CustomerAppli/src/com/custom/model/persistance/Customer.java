package com.custom.model.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_Table")
public class Customer {
@Id
@GeneratedValue
private int id;
private String name;
private String city;
private String country;
private String phoneno;
private String pubEmail;
public Customer() {
	
}
public Customer(String name, String city, String country, String phoneno, String pubEmail) {
	super();
	this.name = name;
	this.city = city;
	this.country = country;
	this.phoneno = phoneno;
	this.pubEmail = pubEmail;
}
public int getId() {
	return id;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getPubEmail() {
	return pubEmail;
}
public void setPubEmail(String pubEmail) {
	this.pubEmail = pubEmail;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", phoneno=" + phoneno
			+ ", pubEmail=" + pubEmail + "]";
}


}
