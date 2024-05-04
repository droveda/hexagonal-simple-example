package com.droveda.archdemo.adapters.out;

import com.droveda.archdemo.adapters.out.repository.CustomerRepository;
import com.droveda.archdemo.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
