package com.droveda.archdemo.application.ports.in;

import com.droveda.archdemo.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
