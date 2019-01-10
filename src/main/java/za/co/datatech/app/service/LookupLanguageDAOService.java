package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.LookupLanguage;
import za.co.datatech.app.repositories.LookupLanguageRepository;

@Service
public class LookupLanguageDAOService {
	
	//private static final Logger LOGGER = Logger.getLogger(LookupTitleDAOService.class);
	
	@Autowired
	private LookupLanguageRepository lookupLanguageRepository;
	
	public List<LookupLanguage> retrieveAllLanaguageDetails(){
		List<LookupLanguage> languageList = new ArrayList<>();
		Iterator<LookupLanguage> languageIterator = lookupLanguageRepository.findAll().iterator();
		while(languageIterator.hasNext())
			languageList.add(languageIterator.next());
		return languageList;
	}
}
