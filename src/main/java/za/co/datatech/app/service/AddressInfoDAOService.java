package za.co.datatech.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.datatech.app.entities.AddressInfo;
import za.co.datatech.app.repositories.AddressInfoRepository;

@Service
public class AddressInfoDAOService {

	@Autowired
	private AddressInfoRepository addressInfoRepository;

	// private static final Logger LOGGER = Logger.getLogger(ContactInfoRepository.class);

	public AddressInfo createAddressDetails(AddressInfo addressInfo) {
		return addressInfoRepository.save(addressInfo);
	}

	public List<AddressInfo> retrieveAllAddressDeatails() {
		List<AddressInfo> addressInfoList = new ArrayList<>();
		Iterator<AddressInfo> addressInfoIterator = addressInfoRepository.findAll().iterator();
		while (addressInfoIterator.hasNext())
			addressInfoList.add(addressInfoIterator.next());
		return addressInfoList;
	}

	public AddressInfo retrieveAddressDetailsById(int contactInfoId) {
		return addressInfoRepository.findOne(contactInfoId);
	}

	public void deletetAddressDetailsById(int contactInfoId) {
		addressInfoRepository.delete(contactInfoId);
	}

	public AddressInfo updateAddressDetails(AddressInfo addressInfo) {
		return addressInfoRepository.save(addressInfo);
	}
}
