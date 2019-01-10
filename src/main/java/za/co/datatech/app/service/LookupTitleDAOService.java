package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.LookupTitle;
import za.co.datatech.app.repositories.LookupTitleRepository;

@Service
public class LookupTitleDAOService {
	
	//private static final Logger LOGGER = Logger.getLogger(LookupTitleDAOService.class);
	
	@Autowired
	private LookupTitleRepository lookupTitleRepository;
	
	public List<LookupTitle> retrieveAllTitleDetails(){
		List<LookupTitle> titleList = new ArrayList<>();
		Iterator<LookupTitle> clientsIterator = lookupTitleRepository.findAll().iterator();
		while(clientsIterator.hasNext())
			titleList.add(clientsIterator.next());
		return titleList;
	}
}
