package com.customermanagement.service;

import com.customermanagement.model.Customer;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void deleteById(Long id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
