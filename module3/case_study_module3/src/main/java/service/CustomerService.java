package service;

import model.customer.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(int customerId) {
        return iCustomerRepository.findById(customerId);
    }

    @Override
    public void save(int customerId, String customerName, String customerBirthday, int customerGender, int customerIdCard, String customerPhone, int customerTypeId, String customerAddress) {
        iCustomerRepository.save(customerId,
        customerName,
        customerBirthday,
        customerGender,
        customerIdCard,
        customerPhone,
        customerTypeId,
        customerAddress);
    }

    @Override
    public boolean createCustomer(Customer customer) {
        Customer customer1 = findById(customer.getCustomerId());
        customer1.toString();
        if (customer1!=null) {
            return false;
        } else {
            iCustomerRepository.createCustomer(customer);
            return true;
        }
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return iCustomerRepository.deleteCustomer(customerId);
    }
}
