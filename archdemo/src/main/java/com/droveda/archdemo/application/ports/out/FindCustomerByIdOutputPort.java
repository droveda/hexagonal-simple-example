package com.droveda.archdemo.application.ports.out;

import com.droveda.archdemo.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
