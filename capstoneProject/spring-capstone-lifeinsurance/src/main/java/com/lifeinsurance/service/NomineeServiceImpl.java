package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Nominee;
import com.lifeinsurance.repository.INomineeRepository;
@Service
public class NomineeServiceImpl implements INomineeService{
	
	@Autowired
	INomineeRepository iNomineeRepository;
	
	@Override
	public void addNominee(Nominee nominee) {
		iNomineeRepository.save(nominee);
		
	}

	@Override
	public void updateNominee(Nominee nominee) {
		iNomineeRepository.save(nominee);
	}

	@Override
	public void deleteNominee(int nomineeId) {
		iNomineeRepository.deleteById(nomineeId);
	}

	@Override
	public List<Nominee> getByNomineeName(String nomineeName) {
		return iNomineeRepository.findByNomineeName(nomineeName);
	}

	@Override
	public Nominee getById(int id) {

		return iNomineeRepository.findById(id).get();
	}

//	@Override
//	public List<Nominee> getByNameAndRelation(String name, String relation) {
//		
//		return iNomineeRepository.findByNameAndRelation(name, relation);
//	}
//
//	@Override
//	public List<Nominee> getByNameAndAge(String name, int age) {
//	
//		return iNomineeRepository.findByNameAndAge(name, age);
//	}

}
