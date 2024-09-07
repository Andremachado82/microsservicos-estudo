package com.andre.customer.mapper;

import com.andre.customer.customer.Address;
import com.andre.customer.customer.Customer;
import com.andre.customer.dto.CustomerRequest;
import com.andre.customer.dto.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toCustomer(@Valid CustomerRequest request) {
        if (request == null) {
            return null;
        }
        var customer = Customer.builder()
                .id(null)
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .address(request.address())
                .build();
        return customer;
    }

    public CustomerResponse fromCustomer(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
