package com.Client.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Client.Entity.ClientEntity;

@Repository
public interface ClientRepo extends JpaRepository<ClientEntity, Integer>{

	ClientEntity findByUsernameAndPassword(String username, String password);

	//ClientEntity findClientByUserNameAndPassword(ClientEntity ce);


}
