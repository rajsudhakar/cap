package com.lifeinsurance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeinsurance.model.Insurance;
import com.lifeinsurance.service.IInsuranceService;

@RestController
@RequestMapping("lifeinsurance-api")
public class InsuranceController {
	
	@Autowired
	IInsuranceService insuranceService;
	
	@PostMapping("/insurance")
	public ResponseEntity<Void> addInsurance(Insurance insurance) {
		insuranceService.addInsurance(insurance);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@PutMapping("/insurance")
	public ResponseEntity<Void> updateInsurance(Insurance insurance){
		insuranceService.updateInsurance(insurance);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
		
	@DeleteMapping("/insurance")
	public ResponseEntity<String> deleteInsurance(int insuranceId){
		insuranceService.deleteInsurance(insuranceId);
		return ResponseEntity.accepted().body("Updated");
	}
	
	@GetMapping("/insurances")
	public ResponseEntity<List<Insurance>> getAll(){
		List<Insurance> insurances= insuranceService.getAll();
//		HttpHeaders httpHeaders=new HttpHeaders();
//		httpHeaders.add("desc", "Getting By all");
//		httpHeaders.add("info", "Getting By all info");
		
		ResponseEntity<List<Insurance>> responseEntity=new ResponseEntity<List<Insurance>>(insurances,  HttpStatus.OK);
		
		return responseEntity;
	}
	@GetMapping("/insurance/name")
	public ResponseEntity<List<Insurance>> getByName(String insuranceName){
		List<Insurance> insurances= insuranceService.getByName(insuranceName);
		return ResponseEntity.status(HttpStatus.OK).body(insurances);
		
	}
	@GetMapping("/insurance/id")
	public ResponseEntity<Insurance> getById(int insuranceId){
		Insurance insurances= insuranceService.getById(insuranceId);
		ResponseEntity<Insurance> responseEntity=new ResponseEntity<Insurance>(insurances, HttpStatus.OK);
		
		return responseEntity;
		
	}
	@GetMapping("/insurance/plan")
	public ResponseEntity<List<Insurance>> getByPlan(String plan){
		List<Insurance> insurances= insuranceService.getByPlan(plan);
		ResponseEntity<List<Insurance>> responseEntity=new ResponseEntity<List<Insurance>>(insurances, HttpStatus.OK);
		
		return responseEntity;
	}
	@GetMapping("/insurance/client")
	public ResponseEntity<List<Insurance>> getByInsuranceAndClients(String insuranceName,String clientName){
		List<Insurance> insurances= insuranceService.getByInsuranceAndClients(insuranceName,clientName);
		ResponseEntity<List<Insurance>> responseEntity=new ResponseEntity<List<Insurance>>(insurances, HttpStatus.OK);
		
		return responseEntity;
	}
}
