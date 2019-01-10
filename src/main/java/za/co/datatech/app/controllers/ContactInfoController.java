package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.ContactInfo;
import za.co.datatech.app.service.ContactInfoDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ContactInfoController {
	
	@Autowired
	private ContactInfoDAOService contactInfoDAOService;
	
	//private static final Logger LOGGER = Logger.getLogger(ContactInfoController.class);
	
	@PutMapping(path="/contactIfo/create")
	public ContactInfo createContactDetails(@RequestBody ContactInfo contactInfo) {
		return contactInfoDAOService.createContactInfo(contactInfo);
	}
	
	public List<ContactInfo> retrieveAllContactDetails(){
		return contactInfoDAOService.retrieveAllContactDeatails();
	}
	
	public ContactInfo retrieveContactDetailsById(int contactInfoId) {
		return contactInfoDAOService.retrieveContactIfoById(contactInfoId);
	}
	
	public ContactInfo updateContactDetailsById(ContactInfo contactInfo) {
		return contactInfoDAOService.updateContactInfo(contactInfo);
	}
	
	public void deleteContactDetailsById(int contactInfoId) {
		contactInfoDAOService.deletetContactInfoById(contactInfoId);
	}

}
