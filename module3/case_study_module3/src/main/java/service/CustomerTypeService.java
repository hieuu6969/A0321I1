package service;

import model.customer.CustomerType;
import repository.CustomerTypeRepository;
import repository.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    ICustomerTypeRepository iCustomerTypeRepository = new CustomerTypeRepository();

    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(int id) {
        return iCustomerTypeRepository.findById(id);
    }

    @Override
    public void save(int id, String name) {

    }

    @Override
    public boolean createCustomerType(CustomerType customerType) {
        return false;
    }

    @Override
    public boolean deleteCustomerType(int id) {
        return false;
    }
}
