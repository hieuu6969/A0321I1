package service;

import model.customer.Customer;
import model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(int id);

    void save(int id,
              String name
              );

    boolean createCustomerType(CustomerType customerType);

    boolean deleteCustomerType(int id);
}
