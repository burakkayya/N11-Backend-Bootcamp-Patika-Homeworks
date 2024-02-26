package com.burakkaya.entities.concretes;

import com.burakkaya.entities.abstracts.Customer;
import com.burakkaya.entities.enums.Status;

public class CorporateCustomer extends Customer {
    private String sector;
    private String taxNumber;

    public CorporateCustomer() {
    }

    public CorporateCustomer(Long id, String name, String email, String phone, String address, Status status, String sector, String taxNumber) {
        super(id, name, email, phone, address, status);
        this.sector = sector;
        this.taxNumber = taxNumber;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String toString() {
        return "\n" +
                "CorporateCustomer{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", sector='" + sector + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", status=" + super.getStatus() +
                '}';
    }
}
