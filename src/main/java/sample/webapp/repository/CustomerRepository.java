package sample.webapp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import sample.webapp.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findAll();
  // Customer findById(long id);
  Customer save(Customer customer);
  // void deleteById(long id);

}