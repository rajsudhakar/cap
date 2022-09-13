package com.lifeinsurance.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.lifeinsurance.model.Insurance;

public interface IInsuranceService {

	void addInsurance(Insurance insurance);
	void updateInsurance(Insurance insurance);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> getByName(String insuranceName);
	Insurance getById(int insuranceId);
	
	List<Insurance> getAll();
//	
//	
	List<Insurance> getByLessSumAssured(double sumAssured);
	List<Insurance> getByHighSumAssured(double sumAssured);
	List<Insurance> getByRangeOfSumAssured(double lessSumAssured,double highSumAssured);
	List<Insurance> getByPlan(String plan);
	List<Insurance> getByInsuranceAndClients(String insuranceName,String clientName);
}
