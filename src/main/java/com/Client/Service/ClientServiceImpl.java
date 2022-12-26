package com.Client.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Client.Entity.ClientEntity;
import com.Client.Repository.ClientRepo;

@Service
public class ClientServiceImpl implements ClientService{
@Autowired
	private ClientRepo clientRepo;
	@Override
	public ClientEntity addClient(ClientEntity client) {
		ClientEntity c = clientRepo.save(client);
		return c; 
	}

	
	@Override
	public List<ClientEntity> getAllClientEntities() {
		return clientRepo.findAll();
	}

	@Override
	public Optional<ClientEntity> getClientById(int id) {
		// TODO Auto-generated method stub
		return clientRepo.findById(id);
	}

	 @Override
	    public void delete(int id) {
	        clientRepo.deleteById(id);
	    }

	public ClientEntity fetchClientByClientname(String username, String password) {
		// TODO Auto-generated method stub
		return clientRepo.findByUsernameAndPassword(username,password);
	}


	

	


	


	
}