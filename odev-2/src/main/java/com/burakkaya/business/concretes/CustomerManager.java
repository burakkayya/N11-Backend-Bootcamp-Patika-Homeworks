package com.burakkaya.business.concretes;

import com.burakkaya.business.abstracts.CustomerService;
import com.burakkaya.entities.abstracts.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {

    private final List<Customer> customers;

    public CustomerManager(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public Customer getById(Long id) {
        return customers.stream().filter(customer -> customer.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(Long id, Customer customer) {
        if (customers.stream().anyMatch(c -> c.getId().equals(id))) {
            customers.set(customers.indexOf(customers.stream().filter(c -> c.getId().equals(id)).findFirst().get()), customer);
        }
    }

    @Override
    public void delete(Long id) {
        if (customers.stream().anyMatch(c -> c.getId().equals(id))) {
            customers.remove(customers.stream().filter(c -> c.getId().equals(id)).findFirst().get());
        }
    }

    @Override
    public List<Customer> getCustomersWithNameContainingLetter(char letter) {
        return customers.stream().filter(customer -> customer.getName().contains(String.valueOf(letter))).toList();
    }
}
