package sample.webapp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sample.webapp.repository.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

  List<CustomerEntity> findAll();
  // Customer findById(long id);
  CustomerEntity save(CustomerEntity customer);
  // void deleteById(long id);

}