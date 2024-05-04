package com.droveda.archdemo.application.ports.in;

import com.droveda.archdemo.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
