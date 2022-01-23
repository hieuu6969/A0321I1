package service;

import model.customer.Contract;
import model.customer.Customer;
import model.service.OtherService;
import model.service.Service;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {

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

    boolean createCustomer(Customer customer);

    boolean deleteCustomer(int customerId);
}
