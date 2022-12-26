package com.Client.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Client.Entity.ClientEntity;
import com.Client.Service.ClientService;

@RestController
@RequestMapping("/ClientEntity")
@CrossOrigin(origins="http://localhost:4200")
public class ClientController {
//	 
	@Autowired
	private ClientService cs;
	
	@PostMapping("/addClient")
	public ClientEntity addClient(@RequestBody ClientEntity client) {
		ClientEntity c = cs.addClient(client);
		return c; 
	}
	
	@PostMapping("/Login")
    public ClientEntity loginexecutive(@RequestBody ClientEntity client) throws Exception
    {
        String username=client.getUsername();
        String password=client.getPassword();
        ClientEntity clientObj=null;
        if(username!=null&& password!=null)
        {
            clientObj=cs.fetchClientByClientname(username, password);
        }

        if(clientObj==null)
        {
            throw new Exception("Your UserName or Password is InValid!!");
        }
        return clientObj;
}	
	@GetMapping("/getClient/{id}")
	public Optional<ClientEntity> getClientEntity(@PathVariable int id) {
		return cs.getClientById(id);
	}
	
	@GetMapping("/getAllClient")
	public List<ClientEntity> getClientEntities() {
		return cs.getAllClientEntities();
	}
	
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable("id") int id) {
		 cs.delete(id);
	}
	
	
	

}
