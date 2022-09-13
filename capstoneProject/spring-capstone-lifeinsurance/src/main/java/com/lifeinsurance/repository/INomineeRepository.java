package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Nominee;
@Repository
public interface INomineeRepository extends JpaRepository<Nominee, Integer>{
	
	@Query("from Nominee n where n.nomineeName=?1")
	List<Nominee> findByNomineeName(String nomineeName);
	@Query("from Nominee n where n.nomineeId=?1")
	List<Nominee> findById(String relation);
	//@Query("from Nominee n  inner join n Name where Relation?2 ")
	//List<Nominee> findByNameAndRelation(String name,String relation);
//	List<Nominee> findByNameAndAge(String name,int age);
}
