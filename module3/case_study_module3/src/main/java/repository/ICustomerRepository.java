package repository;

import model.customer.Contract;
import model.customer.Customer;
import model.service.OtherService;
import model.service.Service;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(int customerId);

    void save(int customerId,
              String customerName,
              String customerBirthday,
              int customerGender,
              int customerIdCard,
              String customerPhone,
              int customerTypeId,
              String customerAddress);

    void createCustomer(Customer customer);

    boolean deleteCustomer(int customerId);
}
