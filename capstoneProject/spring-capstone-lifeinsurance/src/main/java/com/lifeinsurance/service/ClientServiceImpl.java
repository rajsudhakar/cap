package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Client;
import com.lifeinsurance.repository.IClientRepository;
@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository clientRepository;

	@Override
	public void addClient(Client client) {
	clientRepository.save(client);
	}

	@Override
	public void updateClient(Client client) {
	clientRepository.save(client);
		
	}

	@Override
	public void deleteClient(int clientId) {
		clientRepository.deleteById(clientId);
		
	}

	@Override
	public List<Client> getByName(String clientName) {
		return clientRepository.findByName(clientName);
	}

	@Override
	public List<Client> getById(int clientId) {
		return clientRepository.findById(clientId);
	}

	@Override
	public List<Client> getByNameAndId(String clientName, int clientId) {
		return clientRepository.findByNameAndId(clientName, clientId);
	}

	@Override
	public List<Client> getByIdAndNominee(int clientId,String nomineeName) {
		return clientRepository.findByIdAndNominee(clientId, nomineeName);
	}

	

}
