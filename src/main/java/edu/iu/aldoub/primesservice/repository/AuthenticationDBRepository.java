package edu.iu.aldoub.primesservice.repository;

import edu.iu.aldoub.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);
}
