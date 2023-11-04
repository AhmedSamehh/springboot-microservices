package com.seha.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void RegisterCustomer(CustomerRegisterationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
    }
}
