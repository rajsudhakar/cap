package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Address;
import com.lifeinsurance.model.Insurance;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer>{

	
	List<Address> findAll();
	
     //native query
	
	@Query("from Address a where a.streetName=?1")
	List<Address> findBycity(String city);
	
	@Query("from Address a where a.state=?1")
	List<Address> findByState(String state);
	
	@Query("from Address a where a.city=?1 and a.state=?2")
	List<Address> findByCityAndState(String city, String state);
	
}
