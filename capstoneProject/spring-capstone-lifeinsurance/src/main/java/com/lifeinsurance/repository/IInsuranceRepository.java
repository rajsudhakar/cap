package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Insurance;

@Repository
public interface IInsuranceRepository extends JpaRepository<Insurance, Integer> {
	
	//Derived Queries
	
//	void addInsurance(Insurance insurance);
//	void updateInsurance(Insurance insurance);
//	void deleteInsurance(int insuranceId);
	
	List<Insurance> findAll();
	
	@Query(value = "select * from insurance where insurance_id=?1",nativeQuery = true)
	Insurance findById(int insuranceId);
	
	//Custom Queries
	
	@Query("from Insurance i where i.insuranceName=?1")
	List<Insurance> findByName(String insuranceName);
	
	@Query(value="select * from insurance i where i.sum_assured<=?1",nativeQuery = true)
	List<Insurance> findByLessSumAssured(double sumAssured);
	
	@Query(value="select * from insurance i where i.sum_assured>=?1",nativeQuery=true)
	List<Insurance> findByHighSumAssured(double sumAssured);
	
	@Query(value="select * from insurance i where i.sum_assured between ?1 and ?2",nativeQuery = true)
	List<Insurance> findByRangeOfSumAssured(double lessSumAssured,double highSumAssured);
	
	@Query("from Insurance i  where i.plan=?1")
	List<Insurance> findByPlan(String plan);
	
	@Query("from Insurance i inner join i.client c on i.insuranceId=c.clientId where i.insuranceName=?1 and c.clientName=?2")
	List<Insurance> findByInsuranceAndClients(String insuranceName,String clientName);
	
	
	

}
