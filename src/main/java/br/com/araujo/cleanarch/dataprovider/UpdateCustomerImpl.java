package br.com.araujo.cleanarch.dataprovider;

import br.com.araujo.cleanarch.core.dataprovider.IUpdateCustomer;
import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.araujo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements IUpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void updtate(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
