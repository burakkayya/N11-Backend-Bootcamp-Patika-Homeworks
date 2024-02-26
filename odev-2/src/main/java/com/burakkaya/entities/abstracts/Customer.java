package com.burakkaya.entities.abstracts;

import com.burakkaya.entities.enums.Status;

import java.time.LocalDateTime;

public abstract class Customer extends BaseEntity{
    private String name;
    private String email;
    private String phone;
    private String address;
    private Status status;

    protected Customer() {
    }

    protected Customer(Long id, String name, String email, String phone, String address, Status status) {
        super(id, LocalDateTime.now());
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
