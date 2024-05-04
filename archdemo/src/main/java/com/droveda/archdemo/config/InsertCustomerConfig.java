package com.droveda.archdemo.config;

import com.droveda.archdemo.adapters.out.FindAddressByZipCodeAdapter;
import com.droveda.archdemo.adapters.out.InsertCustomerAdapter;
import com.droveda.archdemo.adapters.out.SendCpfValidationAdapter;
import com.droveda.archdemo.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }

}
