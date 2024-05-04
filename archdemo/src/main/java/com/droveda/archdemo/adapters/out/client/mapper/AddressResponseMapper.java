package com.droveda.archdemo.adapters.out.client.mapper;

import com.droveda.archdemo.adapters.out.client.response.AddressResponse;
import com.droveda.archdemo.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
