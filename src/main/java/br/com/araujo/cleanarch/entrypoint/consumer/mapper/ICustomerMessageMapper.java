package br.com.araujo.cleanarch.entrypoint.consumer.mapper;

import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ICustomerMessageMapper {
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
