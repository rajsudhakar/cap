package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Address;
import com.lifeinsurance.repository.IAddressRepository;

@Service
public class AddressServiceImpl implements IAddressService {
    
	@Autowired
	IAddressRepository addressRepository;
	
	@Override
	public void addAddress(Address address) {
		addressRepository.save(address);
		
	}

	@Override
	public void updateAddress(Address address) {
		addressRepository.save(address);
	}

	@Override
	public List<Address> getAll() {
	
	return addressRepository.findAll();
	}

	@Override
	public List<Address> getBycity(String city) {
		
		return addressRepository.findBycity(city);
	}

	@Override
	public List<Address> getByState(String state) {
		
		return addressRepository.findByState(state);
	}

	@Override
	public List<Address> getByCityAndState(String city, String state) {
	
		return addressRepository.findByCityAndState(city, state);
	}


}
