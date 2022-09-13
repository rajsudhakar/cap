package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
	
	
	@Query("from Client c where c.clientName=?1")
	List<Client> findByName(String clientName);
	
	@Query("from Client c where c.clientId=?1")
	List<Client> findById(int clientId);
	
	@Query("from Client c where c.clientName=?1 and c.clientId=?2")
	List<Client> findByNameAndId(String clientName,int clientId);
	
	@Query("from Client c inner join c.nominee n  on c.clientId=n.nomineeId where c.clientId=?1 and n.nomineeName=?2")
	List<Client> findByIdAndNominee(int  clientId,String nomineeName);

}
