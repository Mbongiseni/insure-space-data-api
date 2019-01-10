package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.LookupLanguage;
import za.co.datatech.app.service.LookupLanguageDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LookupLanguageController {
	
	@Autowired
	private LookupLanguageDAOService lookupLanguageDAOService;
	
	@GetMapping(path="/languages")
	public List<LookupLanguage> retrieveAllLanguageDetails(){
		return lookupLanguageDAOService.retrieveAllLanaguageDetails();
	}
}
