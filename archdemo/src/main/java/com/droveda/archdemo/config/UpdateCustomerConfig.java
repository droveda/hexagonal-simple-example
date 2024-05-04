package com.droveda.archdemo.config;

import com.droveda.archdemo.adapters.out.FindAddressByZipCodeAdapter;
import com.droveda.archdemo.adapters.out.UpdateCustomerAdapter;
import com.droveda.archdemo.application.core.usecase.FindCustomerByIdUseCase;
import com.droveda.archdemo.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }


}
