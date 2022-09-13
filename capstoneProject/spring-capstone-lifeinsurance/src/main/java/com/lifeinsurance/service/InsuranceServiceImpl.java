package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Insurance;
import com.lifeinsurance.repository.IInsuranceRepository;
@Service
public class InsuranceServiceImpl implements IInsuranceService{
	
	@Autowired
	IInsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.save(insurance);
	}

	@Override
	public void updateInsurance(Insurance insurance) {
		insuranceRepository.save(insurance);
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteById(insuranceId);
	}

	@Override
	public List<Insurance> getByName(String insuranceName) {
		return insuranceRepository.findByName(insuranceName);
	}

	@Override
	public Insurance getById(int insuranceId) {
		return insuranceRepository.findById(insuranceId);
	}

	@Override
	public List<Insurance> getAll() {
		return insuranceRepository.findAll();
	}
//
	@Override
	public List<Insurance> getByLessSumAssured(double sumAssured) {
		return insuranceRepository.findByLessSumAssured(sumAssured);
	}

	@Override
	public List<Insurance> getByHighSumAssured(double sumAssured) {
		return insuranceRepository.findByHighSumAssured(sumAssured);
	}

	@Override
	public List<Insurance> getByRangeOfSumAssured(double lessSumAssured, double highSumAssured) {
		return insuranceRepository.findByRangeOfSumAssured(lessSumAssured, highSumAssured);
	}

	@Override
	public List<Insurance> getByPlan(String plan) {
		return insuranceRepository.findByPlan(plan);
	}

	@Override
	public List<Insurance> getByInsuranceAndClients(String insuranceName, String clientName) {
		return insuranceRepository.findByInsuranceAndClients(insuranceName,clientName);
	}

	

}
