package com.droveda.archdemo.application.ports.out;

import com.droveda.archdemo.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
