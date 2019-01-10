package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.LookupRace;
import za.co.datatech.app.repositories.LookupRaceRepository;

@Service
public class LookupRaceDAOService {
	
	//private static final Logger LOGGER = Logger.getLogger(LookupRaceDAOService.class);
	
	@Autowired
	private LookupRaceRepository lookupRaceRepository;
	
	public List<LookupRace> retrieveAllRacesDetails(){
		List<LookupRace> racesList = new ArrayList<>();
		Iterator<LookupRace> racesIterator = lookupRaceRepository.findAll().iterator();
		while(racesIterator.hasNext())
			racesList.add(racesIterator.next());
		return racesList;
	}
}
