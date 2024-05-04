package com.droveda.archdemo.adapters.out;

import com.droveda.archdemo.adapters.out.repository.CustomerRepository;
import com.droveda.archdemo.adapters.out.repository.mapper.CustomerEntityMapper;
import com.droveda.archdemo.application.core.domain.Customer;
import com.droveda.archdemo.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerEntityMapper mapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = mapper.toCustomerEntity(customer);
        repository.save(customerEntity);
    }
}
