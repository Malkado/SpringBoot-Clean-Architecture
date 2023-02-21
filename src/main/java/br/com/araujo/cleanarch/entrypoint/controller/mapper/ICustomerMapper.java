package br.com.araujo.cleanarch.entrypoint.controller.mapper;

import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.entrypoint.controller.requests.CustomerRequest;
import br.com.araujo.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "address",ignore = true)
    @Mapping(target = "isValidCpf",ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
