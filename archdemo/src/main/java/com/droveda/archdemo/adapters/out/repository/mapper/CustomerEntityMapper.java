package com.droveda.archdemo.adapters.out.repository.mapper;

import com.droveda.archdemo.adapters.out.repository.entity.CustomerEntity;
import com.droveda.archdemo.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

//    @Mapping(source = "name", target = "name")
//    @Mapping(target = "address", ignore = true)
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
