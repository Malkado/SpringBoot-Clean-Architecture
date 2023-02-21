package br.com.araujo.cleanarch.entrypoint.consumer;

import br.com.araujo.cleanarch.core.usecases.IUpdateCustomerUseCase;
import br.com.araujo.cleanarch.core.usecases.implementations.UpdateCustomerUseCaseImpl;
import br.com.araujo.cleanarch.entrypoint.consumer.mapper.ICustomerMessageMapper;
import br.com.araujo.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReciveValidatedCpfCustomer {
    @Autowired
    IUpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    ICustomerMessageMapper customerMessageMapper;
    @KafkaListener(topics = "tp-cpf-validated", groupId = "araujo")
    public void recive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer,customerMessage.getZipcode());
    }
}
