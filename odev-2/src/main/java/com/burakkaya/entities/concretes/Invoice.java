package com.burakkaya.entities.concretes;

import com.burakkaya.entities.abstracts.BaseEntity;

import java.time.LocalDateTime;

public class Invoice extends BaseEntity {
    private double amount;
    private Order order;

    public Invoice() {
    }

    public Invoice(Long id, double amount, Order order) {
        super(id, LocalDateTime.now());
        this.amount = amount;
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "\n" +
                "Invoice{" +
                "id=" + super.getId() +
                ", amount=" + amount +
                ", order=" + order +
                '}';
    }
}
