package com.lifeinsurance.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "address_gen",strategy =GenerationType.AUTO)
	@SequenceGenerator(name ="address_gen",sequenceName = "address_seq",allocationSize = 1 ,initialValue = 10)
	private Integer addressId;
	private String streetName;
	private String city;
	private String state;
	private int zipcode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String streetName, String city, String state, int zipcode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ "]";
	}
	
	

}
