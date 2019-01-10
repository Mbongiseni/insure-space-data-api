package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.LookupMaritalStatus;
import za.co.datatech.app.repositories.LookupMaritalStatusRepository;

@Service
public class LookupMaritalStatusDAOService {
	
	//private static final Logger LOGGER = Logger.getLogger(LookupTitleDAOService.class);
	
	@Autowired
	private LookupMaritalStatusRepository lookupMaritalSatusRepository;
	
	public List<LookupMaritalStatus> retrieveAllMaritalStatusesDetails(){
		List<LookupMaritalStatus> maritalStatusList = new ArrayList<>();
		Iterator<LookupMaritalStatus> clientsIterator = lookupMaritalSatusRepository.findAll().iterator();
		while(clientsIterator.hasNext())
			maritalStatusList.add(clientsIterator.next());
		return maritalStatusList;
	}
}
