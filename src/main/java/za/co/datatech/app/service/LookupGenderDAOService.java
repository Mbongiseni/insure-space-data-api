package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.datatech.app.entities.LookupGender;
import za.co.datatech.app.repositories.LookupGenderRepository;

@Service
public class LookupGenderDAOService {
	
	@Autowired
	private LookupGenderRepository lookupGenderRepository;
	
	public List<LookupGender> retrieveAllGenderDetails(){
		List<LookupGender> genderList = new ArrayList<>();
		Iterator<LookupGender> genderIterator = lookupGenderRepository.findAll().iterator();
		while(genderIterator.hasNext())
			genderList.add(genderIterator.next());
		return genderList;
	}
}
