package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.Client;
import za.co.datatech.app.service.ClientDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ClientController {
	
	@Autowired
	private ClientDAOService clientDAOService;
	
	//private static final Logger LOGGER = Logger.getLogger(ClientDAOService.class);
	
	@PostMapping(path="/clients/client")
	public Client createClientDetails(@RequestBody Client client) {
		return clientDAOService.createClient(client);
	}
	
	@PutMapping(path="/clients/update/client")
	public Client updateClientDetails(@RequestBody Client client) {
		return clientDAOService.updateClientDetails(client);
	}
	
	@GetMapping(path="/clients")
	public List<Client> retrieveAllClientsDetails(){
		return clientDAOService.retrieveAllClients();
	}
	
	@GetMapping(path="/clients/retrieve/{clientId}")
	public Client retrieveClientDetailsById(@PathVariable int clientId) {
		return clientDAOService.retrieveClientById(clientId);
	}
	
	@DeleteMapping(path="/clients/remove/{clientId}")
	public void deleteClientDetailsById(@PathVariable int clientId) {
		clientDAOService.deletetClientById(clientId);
	}
}
