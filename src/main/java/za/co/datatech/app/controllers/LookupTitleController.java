package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.LookupTitle;
import za.co.datatech.app.service.LookupTitleDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LookupTitleController {
	//private static final Logger LOGGER = Logger.getLogger(ClientDAOService.class);
	
	@Autowired
	private LookupTitleDAOService lookupTitleDAOService;
	
	@GetMapping(path="/titles")
	public List<LookupTitle> retrieveAllTitleDetails(){
		return lookupTitleDAOService.retrieveAllTitleDetails();
	}
}
