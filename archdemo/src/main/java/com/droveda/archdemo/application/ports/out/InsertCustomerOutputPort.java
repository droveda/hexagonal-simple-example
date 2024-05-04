package com.droveda.archdemo.application.ports.out;

import com.droveda.archdemo.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
