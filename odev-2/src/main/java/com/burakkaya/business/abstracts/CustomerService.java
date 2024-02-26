package com.burakkaya.business.abstracts;

import com.burakkaya.entities.abstracts.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    Customer getById(Long id);
    void add(Customer customer);
    void update(Long id, Customer customer);
    void delete(Long id);
    List<Customer> getCustomersWithNameContainingLetter(char letter);
}
