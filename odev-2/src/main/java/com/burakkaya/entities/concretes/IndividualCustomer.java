package com.burakkaya.entities.concretes;

import com.burakkaya.entities.abstracts.Customer;
import com.burakkaya.entities.enums.Status;

public class IndividualCustomer extends Customer {
    private String identityNumber;

    public IndividualCustomer() {
    }

    public IndividualCustomer(Long id, String name, String email, String phone, String address, Status status, String identityNumber) {
        super(id, name, email, phone, address, status);
        this.identityNumber = identityNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    @Override
public String toString() {
        return "\n" +
                "IndividualCustomer{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", status=" + super.getStatus() +
                '}';
    }
}
