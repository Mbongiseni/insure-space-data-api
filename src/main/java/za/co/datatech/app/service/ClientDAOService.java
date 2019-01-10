package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.Client;
import za.co.datatech.app.repositories.ClientRepository;

@Service
public class ClientDAOService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	private static final Logger LOGGER = Logger.getLogger(ClientRepository.class);
	
	public Client createClient(Client client) {
		LOGGER.info("CLIENT>>>>>> " + client);
		Client saveClient = clientRepository.save(client);
		return saveClient;
	}
	
	public List<Client> retrieveAllClients(){
		List<Client> clients = new ArrayList<>();
		Iterator<Client> clientsIterator = clientRepository.findAll().iterator();
		while(clientsIterator.hasNext())
			clients.add(clientsIterator.next());
		return clients;
	}

	public Client retrieveClientById(int clientId) {
		return clientRepository.findOne(clientId);
	}

	public void deletetClientById(int clientId) {
		clientRepository.delete(clientId);
	}

	public Client updateClientDetails(Client client) {
		return clientRepository.save(client);
	}

}
