package com.burakkaya.business.concretes;

import com.burakkaya.business.abstracts.OrderService;
import com.burakkaya.entities.concretes.Order;

import java.util.List;

public class OrderManager implements OrderService {

    private final List<Order> orders;

    public OrderManager(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public Order getById(Long id) {
        return orders.stream().filter(order -> order.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void add(Order customer) {
        orders.add(customer);
    }

    @Override
    public void update(Long id, Order customer) {
        if (orders.stream().anyMatch(c -> c.getId().equals(id))) {
            orders.set(orders.indexOf(orders.stream().filter(c -> c.getId().equals(id)).findFirst().get()), customer);
        }
    }

    @Override
    public void delete(Long id) {
        if (orders.stream().anyMatch(c -> c.getId().equals(id))) {
            orders.remove(orders.stream().filter(c -> c.getId().equals(id)).findFirst().get());
        }
    }
}
