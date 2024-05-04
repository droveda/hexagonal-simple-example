package com.droveda.archdemo.adapters.in.consumer;

import com.droveda.archdemo.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.droveda.archdemo.adapters.in.consumer.message.CustomerMessage;
import com.droveda.archdemo.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper mapper;

    @KafkaListener(topics = {"tp-cpf-validated"}, groupId = "droveda")
    public void receive(CustomerMessage customerMessage) {
        var customer = mapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
