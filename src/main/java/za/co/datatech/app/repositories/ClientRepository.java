package za.co.datatech.app.repositories;

import org.springframework.data.repository.CrudRepository;

import za.co.datatech.app.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
