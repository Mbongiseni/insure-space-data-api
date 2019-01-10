package za.co.datatech.app.repositories;

import org.springframework.data.repository.CrudRepository;

import za.co.datatech.app.entities.ContactInfo;

public interface ContactInfoRepository extends CrudRepository<ContactInfo, Integer> {

}
