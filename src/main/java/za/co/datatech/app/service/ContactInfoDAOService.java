package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.ContactInfo;
import za.co.datatech.app.repositories.ContactInfoRepository;

@Service
public class ContactInfoDAOService {
	
	@Autowired
	private ContactInfoRepository contactInfoRepository;
	
	//private static final Logger LOGGER = Logger.getLogger(ContactInfoRepository.class);
	
	public ContactInfo createContactInfo(ContactInfo contactInfo) {
		return contactInfoRepository.save(contactInfo);
	}
	
	public List<ContactInfo> retrieveAllContactDeatails(){
		List<ContactInfo> contactInfoList = new ArrayList<>();
		Iterator<ContactInfo> contactInfoIterator = contactInfoRepository.findAll().iterator();
		while(contactInfoIterator.hasNext())
			contactInfoList.add(contactInfoIterator.next());
		return contactInfoList;
	}
	
	public ContactInfo retrieveContactIfoById(int contactInfoId) {
		return contactInfoRepository.findOne(contactInfoId);
	}
	
	public void deletetContactInfoById(int contactInfoId) {
		contactInfoRepository.delete(contactInfoId);
	}
	
	public ContactInfo updateContactInfo(ContactInfo contactInfo) {
		return contactInfoRepository.save(contactInfo);
	}
}
