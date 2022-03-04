package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer findCustomerById(Long id);
}
