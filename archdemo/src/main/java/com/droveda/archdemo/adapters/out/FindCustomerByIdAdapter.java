package com.droveda.archdemo.adapters.out;

import com.droveda.archdemo.adapters.out.repository.CustomerRepository;
import com.droveda.archdemo.adapters.out.repository.entity.CustomerEntity;
import com.droveda.archdemo.adapters.out.repository.mapper.CustomerEntityMapper;
import com.droveda.archdemo.application.core.domain.Customer;
import com.droveda.archdemo.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerEntityMapper mapper;

    @Override
    public Optional<Customer> find(String id) {
        Optional<CustomerEntity> customerEntity = repository.findById(id);
        return customerEntity.map(entity -> mapper.toCustomer(entity));
    }
}
