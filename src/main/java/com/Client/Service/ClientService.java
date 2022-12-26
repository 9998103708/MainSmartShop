package com.Client.Service;

import java.util.List;
import java.util.Optional;

import com.Client.Entity.ClientEntity;

public interface ClientService {
	public ClientEntity addClient(ClientEntity client);
	public List<ClientEntity> getAllClientEntities();
	public Optional<ClientEntity> getClientById(int id);
	 public void delete(int id);
	public ClientEntity fetchClientByClientname(String username, String password);

}
