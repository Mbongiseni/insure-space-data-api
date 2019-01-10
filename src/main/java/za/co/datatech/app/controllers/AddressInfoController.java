package za.co.datatech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import za.co.datatech.app.entities.AddressInfo;
import za.co.datatech.app.service.AddressInfoDAOService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class AddressInfoController {

	@Autowired
	private AddressInfoDAOService addressInfoDAOService;

	// private static final Logger LOGGER = Logger.getLogger(AddressInfoDAOService.class);

	@PostMapping(path = "/addressInfo/addressInfoObj")
	public AddressInfo createAddressDetails(@RequestBody AddressInfo addressInfoObj) {
		return addressInfoDAOService.createAddressDetails(addressInfoObj);
	}

	@PutMapping(path = "/addressInfo/update/addressInfoObj")
	public AddressInfo updateAddressDetails(@RequestBody AddressInfo addressInfoObj) {
		return addressInfoDAOService.updateAddressDetails(addressInfoObj);
	}

	@GetMapping(path = "/addressInfo/addressInfoObj")
	public List<AddressInfo> retrieveAllAddressDeatail() {
		return addressInfoDAOService.retrieveAllAddressDeatails();
	}

	@GetMapping(path = "/addressInfo/retrieve/{addressInfoObjId}")
	public AddressInfo retrieveAddressDetailsById(@PathVariable int addressInfoObj) {
		return addressInfoDAOService.retrieveAddressDetailsById(addressInfoObj);
	}

	@DeleteMapping(path = "/addressInfo/remove/{addressInfoObjId}")
	public void deleteAddressDetailsById(@PathVariable int addressInfoObj) {
		addressInfoDAOService.deletetAddressDetailsById(addressInfoObj);
	}
}
