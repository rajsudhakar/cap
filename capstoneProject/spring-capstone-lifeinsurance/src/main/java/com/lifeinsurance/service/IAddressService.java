package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Address;


public interface IAddressService {

	void addAddress(Address address);
	void updateAddress(Address address);
	
	List<Address> getAll();

	List<Address> getBycity(String city);
	List<Address> getByState(String state);
	List<Address> getByCityAndState(String city, String state);
	
}
