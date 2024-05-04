package com.droveda.archdemo.adapters.in.consumer.mapper;

import com.droveda.archdemo.adapters.in.consumer.message.CustomerMessage;
import com.droveda.archdemo.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
