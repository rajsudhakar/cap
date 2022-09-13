package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Client;
import com.lifeinsurance.model.Nominee;

public interface IClientService {

	void addClient(Client client);
	void updateClient(Client client);
	void deleteClient(int clientId);
	
	
	List<Client> getByName(String clientName);
	List<Client> getById(int clientId);
	List<Client> getByNameAndId(String clientName,int clientId);
	List<Client> getByIdAndNominee(int  clientId,String nomineeName);

}

