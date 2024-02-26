package com.burakkaya.entities.concretes;

import com.burakkaya.entities.abstracts.BaseEntity;
import com.burakkaya.entities.abstracts.Customer;

import java.time.LocalDateTime;

public class Order extends BaseEntity {
    private Customer customer;

    public Order() {
    }

    public Order(Long id, Customer customer) {
        super(id, LocalDateTime.now());
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "\n" +
                "Order{" +
                "id=" + super.getId() +
                ", customer=" + customer +
                '}';
    }
}
