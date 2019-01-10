package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.LookupRace;
import za.co.datatech.app.service.LookupRaceDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LookupRacesController {
	
	@Autowired
	private LookupRaceDAOService lookupRaceDAOServicec;
	
	@GetMapping(path="/races")
	public List<LookupRace> retrieveAllMaritalStatusesDetails(){
		return lookupRaceDAOServicec.retrieveAllRacesDetails();
	}
}
