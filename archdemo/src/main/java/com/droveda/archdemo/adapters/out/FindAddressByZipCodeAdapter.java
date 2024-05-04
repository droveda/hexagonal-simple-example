package com.droveda.archdemo.adapters.out;

import com.droveda.archdemo.adapters.out.client.FindAddressByZipCodeClient;
import com.droveda.archdemo.adapters.out.client.mapper.AddressResponseMapper;
import com.droveda.archdemo.application.core.domain.Address;
import com.droveda.archdemo.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient client;

    @Autowired
    private AddressResponseMapper mapper;


    @Override
    public Address find(String zipCode) {
        var addressResponse = client.find(zipCode);
        return mapper.toAddress(addressResponse);
    }
}
