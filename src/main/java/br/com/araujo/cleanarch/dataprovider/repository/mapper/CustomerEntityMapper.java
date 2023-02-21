package br.com.araujo.cleanarch.dataprovider.repository.mapper;

import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
