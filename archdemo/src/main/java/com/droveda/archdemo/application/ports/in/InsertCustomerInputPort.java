package com.droveda.archdemo.application.ports.in;

import com.droveda.archdemo.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
