package com.burakkaya.business.abstracts;

import com.burakkaya.entities.concretes.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
    Order getById(Long id);
    void add(Order customer);
    void update(Long id, Order customer);
    void delete(Long id);
}
