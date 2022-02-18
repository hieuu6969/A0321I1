package repository;

import model.customer.Customer;
import model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> findAll();

    CustomerType findById(int id);

    void save(int id,
              String name);

    void createCustomerType(CustomerType customerType);

    boolean deleteCustomerType(int id);
}
