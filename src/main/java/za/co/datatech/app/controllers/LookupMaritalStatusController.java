package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.LookupMaritalStatus;
import za.co.datatech.app.service.LookupMaritalStatusDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LookupMaritalStatusController {
	
	@Autowired
	private LookupMaritalStatusDAOService lookupMaritalStatusDAOService;
	
	@GetMapping(path="/marital-statuses")
	public List<LookupMaritalStatus> retrieveAllMaritalStatusesDetails(){
		return lookupMaritalStatusDAOService.retrieveAllMaritalStatusesDetails();
	}
}
