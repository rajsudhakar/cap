package com.lifeinsurance.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lifeinsurance.model.Nominee;


public interface INomineeService{

	void addNominee(Nominee nominee);
	void updateNominee(Nominee nominee );
	void deleteNominee(int nomineeId);
	
	List<Nominee> getByNomineeName(String nomineeName);
	Nominee getById(int id);
//	List<Nominee> getByNameAndRelation(String name,String relation);
//	List<Nominee> getByNameAndAge(String name,int age);
}
